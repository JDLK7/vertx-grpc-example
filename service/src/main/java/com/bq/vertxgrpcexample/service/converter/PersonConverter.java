package com.bq.vertxgrpcexample.service.converter;

import com.bq.vertxgrpcexample.service.proto.Person;
import io.vertx.core.json.JsonObject;

public interface PersonConverter extends Converter<Person> {

    @Override
    default Person jsonToMessage(JsonObject json) {
        return Person.newBuilder()
                .setId(json.getString("_id", ""))
                .setName(json.getString("name", ""))
                .setLastName(json.getString("lastName", ""))
                .setEmail(json.getString("email", ""))
                .setAge(json.getInteger("age", 0))
                .build();
    }

    @Override
    default JsonObject messageToJson(Person person) {
        return new JsonObject()
                .put("_id", person.getId())
                .put("name", person.getName())
                .put("lastName", person.getLastName())
                .put("email", person.getEmail())
                .put("age", person.getAge());
    }
}
