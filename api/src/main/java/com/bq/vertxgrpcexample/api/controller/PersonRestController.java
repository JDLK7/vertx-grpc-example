package com.bq.vertxgrpcexample.api.controller;

import com.bq.errorhandler.ErrorHandler;
import com.bq.errorhandler.errors.NotFoundError;
import com.bq.vertxgrpcexample.api.converter.PersonConverter;
import com.bq.vertxgrpcexample.api.dto.PersonDto;
import com.bq.vertxgrpcexample.api.proto.FetchAllRequest;
import com.bq.vertxgrpcexample.api.proto.FetchPersonRequest;
import com.bq.vertxgrpcexample.api.proto.Person;
import com.bq.vertxgrpcexample.api.proto.PersonServiceGrpc.PersonServiceVertxStub;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.json.Json;
import io.vertx.reactivex.ext.web.RoutingContext;

public class PersonRestController implements RestController, PersonConverter {

    private static final Byte LOCK = 0;

    private Person emptyPerson = Person.newBuilder().build();
    private PersonServiceVertxStub serviceStub;
    private ErrorHandler errorHandler;

    private static PersonRestController instance;

    private PersonRestController(PersonServiceVertxStub serviceStub, ErrorHandler errorHandler) {
        this.serviceStub = serviceStub;
        this.errorHandler = errorHandler;
    }

    public static PersonRestController getInstance(PersonServiceVertxStub serviceStub, ErrorHandler errorHandler) {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new PersonRestController(serviceStub, errorHandler);
                }
            }
        }

        return instance;
    }

    @Override
    public void list(RoutingContext routingContext) {
        var request = FetchAllRequest.newBuilder()
                .setFrom(0)
                .setTo(10)
                .build();

        serviceStub.fetchAll(request, fetchResponse -> {
            if (fetchResponse.succeeded()) {
                var people = fetchResponse.result().getPeopleList();
                routingContext.response().end(Json.encode(messageListToJsonList(people)));
            } else {
                errorHandler.handleError(routingContext, fetchResponse.cause());
            }
        });
    }

    @Override
    public void show(RoutingContext routingContext) {
        var id = routingContext.request().getParam("id");
        var request = FetchPersonRequest.newBuilder()
                .setId(id)
                .build();

        serviceStub.fetchPerson(request, fetchResponse -> {
            if (fetchResponse.succeeded()) {
                var person = fetchResponse.result();

                if (!person.equals(emptyPerson)) {
                    routingContext.response().end(messageToJson(person).encode());
                } else {
                    errorHandler.handleError(routingContext, new NotFoundError("Person not found for id: " + id));
                }
            } else {
                errorHandler.handleError(routingContext, fetchResponse.cause());
            }
        });
    }

    @Override
    public void create(RoutingContext routingContext) {
        try {
            var inboundPersonDto = PersonDto.fromJson(routingContext.getBodyAsJson());
            var inboundPerson = Person.newBuilder()
                    .setName(inboundPersonDto.getName())
                    .setLastName(inboundPersonDto.getLastName())
                    .setEmail(inboundPersonDto.getEmail())
                    .setAge(inboundPersonDto.getAge())
                    .build();

            serviceStub.createPerson(inboundPerson, createResponse -> {
                if (createResponse.succeeded()) {
                    var person = createResponse.result();

                    routingContext.response()
                            .setStatusCode(HttpResponseStatus.CREATED.code())
                            .end(messageToJson(person).encode());
                } else {
                    errorHandler.handleError(routingContext, createResponse.cause());
                }
            });
        } catch (Exception ex) {
            errorHandler.handleError(routingContext, ex);
        }

    }

    @Override
    public void update(RoutingContext routingContext) {}

    @Override
    public void delete(RoutingContext routingContext) {}
}
