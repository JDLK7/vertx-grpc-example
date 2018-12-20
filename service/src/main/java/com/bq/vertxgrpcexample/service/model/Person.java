package com.bq.vertxgrpcexample.service.model;

import io.vertx.core.json.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class Person extends Model {

    public static final String COLLECTION_NAME = "people";

    private String name;
    private String lastName;
    private String email;
    private int age;

    public Person() {
        super();
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.age = -1;
    }

    public Person(String name, String lastName, String email, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Person fromMap(Map<String, String> map) {
        var person = new Person();

        if (map.size() != 0) {
            person.setId(map.get("id"));
            person.setName(map.get("name"));
            person.setLastName(map.get("lastName"));
            person.setEmail(map.get("email"));
            person.setAge(Integer.valueOf(map.get("age")));
            person.setCreatedAt(Long.valueOf(map.get("createdAt")));
            person.setUpdatedAt(Long.valueOf(map.get("updatedAt")));
            person.setDeletedAt(Long.valueOf(map.get("deletedAt")));
        }

        return person;
    }

    public Map<String, String> toMap() {
        var map = new HashMap<String, String>();

        map.put("id", getId());
        map.put("name", getName());
        map.put("lastName", getLastName());
        map.put("email", getEmail());
        map.put("age", String.valueOf(getAge()));
        map.put("createdAt", String.valueOf(getCreatedAt()));
        map.put("updatedAt", String.valueOf(getUpdatedAt()));
        map.put("deletedAt", String.valueOf(getDeletedAt()));

        return map;
    }

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
