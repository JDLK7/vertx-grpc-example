package com.bq.vertxgrpcexample.service.verticles;

import com.bq.vertxgrpcexample.service.config.SharedConfig;
import com.bq.vertxgrpcexample.service.repository.MongoDbRepository;
import com.bq.vertxgrpcexample.service.repository.Repository;
import com.bq.vertxgrpcexample.service.service.PersonService;
import io.vertx.grpc.VertxServerBuilder;
import io.vertx.reactivex.core.AbstractVerticle;

/**
 * MainVerticle is where the app bootstraps and the different dependencies are
 * instantiated. It is also where the database and RPC server are setup.
 */
public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        var sharedConfig = SharedConfig.getInstance();

        var rpcHost = sharedConfig.getRpcHost().orElse("localhost");
        var rpcPort = sharedConfig.getRpcPort().orElse(8000);

        vertx.executeBlocking(future -> {
            future.complete(MongoDbRepository.getInstance(vertx, sharedConfig));
        }, result -> {
            var repository = (Repository) result.result();
            var service = PersonService.getInstance(repository);

            var rpcServer = VertxServerBuilder
                    .forAddress(vertx.getDelegate(), rpcHost, rpcPort)
                    .addService(service)
                    .build();

            rpcServer.start(event -> {
                if (event.succeeded()) {
                    System.out.println(String.format("Server listening on: %s:%s", rpcHost, rpcPort));
                } else {
                    System.out.println("Error at server startup " + event.cause());
                }
            });
        });
    }

}
