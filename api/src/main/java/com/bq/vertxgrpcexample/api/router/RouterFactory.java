package com.bq.vertxgrpcexample.api.router;

import com.bq.vertxgrpcexample.api.controller.RestController;
import io.vertx.core.http.HttpMethod;
import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.ext.web.Router;
import io.vertx.reactivex.ext.web.handler.BodyHandler;

import java.util.List;

/**
 * RouterFactory contains a variety of helper methods for building a Vertx HTTP router for a given resource.
 */
public interface RouterFactory {

    /**
     * Builds a simple router with a BodyHandler and the usual headers for working with JSON request and responses.
     * @param vertx
     * @return
     */
    default Router router(Vertx vertx) {
        var router = Router.router(vertx);

        router.route().handler(BodyHandler.create());
        router.route().handler(routingContext -> {
            routingContext.response()
                    .putHeader("content-type", "application/json");

            routingContext.next();
        });

        return router;
    }

    /**
     * Given a resource name, builds a router with all the REST methods following the REST
     * standard. It also attaches a controller for handling the incoming requests.
     * @param vertx
     * @param resourceName
     * @param controller
     * @return
     */
    default Router restRouter(Vertx vertx, String resourceName, RestController controller) {
        var router = router(vertx);

        router.get(String.format("/%s/", resourceName)).handler(controller::list);
        router.post(String.format("/%s/", resourceName)).handler(controller::create);
        router.get(String.format("/%s/:id", resourceName)).handler(controller::show);
        router.put(String.format("/%s/:id", resourceName)).handler(controller::update);
        router.delete(String.format("/%s/:id", resourceName)).handler(controller::delete);

        return router;
    }

    /**
     * Given a resource name, builds a router with the selected REST methods following the
     * REST standard. It also attaches a controller for handling the incoming requests.
     * @param vertx
     * @param resourceName
     * @param controller
     * @param methods
     * @return
     */
    default Router restRouter(Vertx vertx, String resourceName, RestController controller, List<String> methods) {
        var router = router(vertx);

        for (var method : methods) {
            switch (HttpMethod.valueOf(method)) {
                case GET:
                    router.get(String.format("/%s/", resourceName)).handler(controller::list);
                    router.get(String.format("/%s/:id", resourceName)).handler(controller::show);
                    break;
                case POST:
                    router.post(String.format("/%s/", resourceName)).handler(controller::create);
                    break;
                case PUT:
                case PATCH:
                case DELETE:
                    router.route(HttpMethod.valueOf(method), String.format("/%s/:id", resourceName)).handler(controller::update);
                    break;
            }
        }

        return router;
    }

}
