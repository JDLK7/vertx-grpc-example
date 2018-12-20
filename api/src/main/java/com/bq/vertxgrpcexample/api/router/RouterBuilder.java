package com.bq.vertxgrpcexample.api.router;

import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.ext.web.Router;

import java.util.HashMap;
import java.util.Map;

public class RouterBuilder implements RouterFactory {

    private Vertx vertx;
    private String context;
    private Map<String, Router> subRouters;

    public RouterBuilder(Vertx vertx) {
        this.vertx = vertx;
        subRouters = new HashMap<>();
    }

    public RouterBuilder withContext(String context) {
        this.context = context;
        return this;
    }

    public RouterBuilder withSubrouter(String mountPoint, Router subRouter) {
        subRouters.put(mountPoint, subRouter);
        return this;
    }

    public Router build() {
        var router = Router.router(vertx);

        for (Map.Entry<String, Router> subRouter : subRouters.entrySet()) {
            router.mountSubRouter(subRouter.getKey(), subRouter.getValue());
        }

        var mainRouter = (context != null)
                ? Router.router(vertx).mountSubRouter("/" + context, router)
                : router;

        return mainRouter;
    }

}
