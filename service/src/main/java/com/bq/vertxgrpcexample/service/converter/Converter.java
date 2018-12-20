package com.bq.vertxgrpcexample.service.converter;

import com.google.protobuf.Message;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Converter is a generic interface for converting protobuf messages into Vertx JsonObjects and vice versa.
 * @param <Proto> protobuf class that extends Message.
 */
public interface Converter<Proto extends Message> {

    /**
     * Converts the given JsonObject into a protobuf Message.
     * @param json an inbound JsonObject.
     * @return an outgoing protobuf Message.
     */
    Proto jsonToMessage(JsonObject json);

    /**
     * Converts the given protobuf message into a JsonObject.
     * @param proto an inbound protobuf message.
     * @return an outgoing JsonObject.
     */
    JsonObject messageToJson(Proto proto);

    /**
     * Applies the JsonObject to protobuf Message conversion to every item in a list.
     * @param jsons a list of JsonObject.
     * @return a list of protobuf Message.
     */
    default List<Proto> jsonListToMessageList(List<JsonObject> jsons) {
        return jsons.stream().map(this::jsonToMessage).collect(Collectors.toList());
    }

    /**
     * Applies the protobuf Message to JsonObject conversion to every item in a list.
     * @param protos a list of protobuf Message.
     * @return a list of JsonObject.
     */
    default List<JsonObject> messageListToJsonList(List<Proto> protos) {
        return protos.stream().map(this::messageToJson).collect(Collectors.toList());
    }

}
