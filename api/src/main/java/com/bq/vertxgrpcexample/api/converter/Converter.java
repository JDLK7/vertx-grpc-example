package com.bq.vertxgrpcexample.api.converter;

import com.google.protobuf.Message;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.stream.Collectors;

public interface Converter<Proto extends Message> {

    Proto jsonToMessage(JsonObject json);

    JsonObject messageToJson(Proto proto);

    default List<Message> jsonListToMessageList(List<JsonObject> jsons) {
        return jsons.stream().map(this::jsonToMessage).collect(Collectors.toList());
    }

    default List<JsonObject> messageListToJsonList(List<Proto> protos) {
        return protos.stream().map(this::messageToJson).collect(Collectors.toList());
    }

}
