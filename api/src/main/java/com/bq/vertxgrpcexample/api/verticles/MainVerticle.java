package com.bq.vertxgrpcexample.api.verticles;

import com.bq.errorhandler.ErrorHandler;
import com.bq.errorhandler.reporters.ReporterFactory;
import com.bq.errorhandler.reporters.ReporterType;
import com.bq.sdk.api.proto.PersonServiceGrpc;
import com.bq.vertxgrpcexample.api.config.SharedConfig;
import com.bq.vertxgrpcexample.api.controller.PersonRestController;
import com.bq.vertxgrpcexample.api.router.RouterBuilder;
import io.vertx.grpc.VertxChannelBuilder;
import io.vertx.reactivex.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        var sharedConfig = SharedConfig.getInstance();

        var httpHost = sharedConfig.getHost().orElse("localhost");
        var httpPort = sharedConfig.getPort().orElse(8080);
        var serviceHost = sharedConfig.getHost().orElse("localhost");
        var servicePort = sharedConfig.getPort().orElse(8000);

        var context = sharedConfig.getContext().orElse("default-context");

        var channel = VertxChannelBuilder
                .forAddress(vertx.getDelegate(), serviceHost, servicePort)
                .usePlaintext(true)
                .build();
        var serviceStub = PersonServiceGrpc.newVertxStub(channel);

        var errorReporter = ReporterFactory.INSTANCE.newReporter(ReporterType.STDOUT);
        var errorHandler = new ErrorHandler(errorReporter);

        var personController = PersonRestController.getInstance(serviceStub, errorHandler);

        var routerBuilder = new RouterBuilder(vertx);
        var personRouter = routerBuilder.restRouter(vertx, "people", personController);
        var router = routerBuilder
                .withContext(context)
                .withSubrouter("/v1", personRouter)
                .build();

        vertx.createHttpServer().requestHandler(router::accept).rxListen(httpPort, httpHost).subscribe(httpServer -> {
            System.out.println(String.format("HTTP server started on http://%s:%s/%s", httpHost, httpPort, context));
        });
    }

}
