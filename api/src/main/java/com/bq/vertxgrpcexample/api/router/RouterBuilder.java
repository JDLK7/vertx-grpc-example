package com.bq.vertxgrpcexample.api.router;

import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.ext.web.Router;

import java.util.HashMap;
import java.util.Map;

/**
 * RouterBuilder is a fluent builder class that helps you to build a Vertx router with contexts and subrouters.
 */
public class RouterBuilder implements RouterFactory {

    private Vertx vertx;
    private String context;
    private Map<String, Router> subRouters;

    public RouterBuilder(Vertx vertx) {
        this.vertx = vertx;
        subRouters = new HashMap<>();
    }

    /**
     * Puts a context to the different routes of the router.
     * @param context
     * @return
     */
    public RouterBuilder withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Attaches a subrouter in the given mount point.
     * @param mountPoint
     * @param subRouter
     * @return
     */
    public RouterBuilder withSubrouter(String mountPoint, Router subRouter) {
        subRouters.put(mountPoint, subRouter);
        return this;
    }

    /**
     * Finally builds and returns the constructed router.
     * @return
     */
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
