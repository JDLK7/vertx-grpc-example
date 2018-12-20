package com.bq.vertxgrpcexample.api.controller;

import io.vertx.reactivex.ext.web.RoutingContext;

public interface RestController {

    void list(RoutingContext routingContext);

    void show(RoutingContext routingContext);

    void create(RoutingContext routingContext);

    void update(RoutingContext routingContext);

    void delete(RoutingContext routingContext);

}
