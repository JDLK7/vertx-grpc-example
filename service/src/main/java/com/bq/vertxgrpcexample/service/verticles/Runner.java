package com.bq.vertxgrpcexample.service.verticles;

import com.bq.vertxgrpcexample.service.config.SharedConfig;
import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Runner {

    public static void run(Class clazz) {
        run(List.of(clazz), new VertxOptions().setClustered(false), null);
    }

    public static void run(List<Class> classes) {
        run(classes, new VertxOptions().setClustered(false), null);
    }

    public static void run(List<Class> classes, VertxOptions options, DeploymentOptions deploymentOptions) {
        List<String> verticleNames = classes.stream().map(Class::getName).collect(Collectors.toList());

        System.setProperty("vertx.cwd", "/");
        Consumer<Vertx> runner = vertx -> {

            var configPath = Optional.ofNullable(System.getenv("CONFIG_PATH"));
            var fileStore = new ConfigStoreOptions()
                    .setType("file")
                    .setFormat("json")
                    .setConfig(new JsonObject().put("path", configPath.orElse("config.json")));

            var configOptions = new ConfigRetrieverOptions().addStore(fileStore);
            var configRetriever = ConfigRetriever.create(vertx, configOptions);

            configRetriever.getConfig(ar -> {
                if (ar.succeeded()) {
                    SharedConfig.getInstance().init(ar.result());

                    try {
                        for (var verticleName : verticleNames) {
                            if (deploymentOptions != null) {
                                vertx.deployVerticle(verticleName, deploymentOptions);
                            } else {
                                vertx.deployVerticle(verticleName);
                            }
                        }
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                }
            });
        };
        if (options.isClustered()) {
            Vertx.clusteredVertx(options, res -> {
                if (res.succeeded()) {
                    Vertx vertx = res.result();
                    runner.accept(vertx);
                } else {
                    res.cause().printStackTrace();
                }
            });
        } else {
            Vertx vertx = Vertx.vertx(options);
            runner.accept(vertx);
        }
    }

}
