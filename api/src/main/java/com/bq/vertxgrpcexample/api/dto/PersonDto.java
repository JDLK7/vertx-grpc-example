package com.bq.vertxgrpcexample.api.dto;

import com.bq.errorhandler.dtos.ErrorBag;
import com.bq.errorhandler.errors.InvalidInboundEntityException;
import io.vertx.core.json.JsonObject;

public class PersonDto extends Dto {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private int age;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;

    public PersonDto() {
        super();

        this.id = "";
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.age = -1;
        this.createdAt = -1;
        this.updatedAt = -1;
        this.deletedAt = -1;
    }

    public PersonDto(String name, String lastName, String email, int age) {
        super();

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public PersonDto(String id, String name, String lastName, String email, int age, long createdAt, long updatedAt, long deletedAt) {
        super();

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    @Override
    public ErrorBag isValid() {
        var errorBag = new ErrorBag();

        if (name == null || name.isEmpty()) {
            errorBag.put("name", "name must be not null or empty");
        }

        if (email == null || email.isEmpty()) {
            errorBag.put("email", "email must be not null or empty");
        }

        if (age < 0) {
            errorBag.put("age", "age must be greater than 0");
        }

        return errorBag;
    }

    public static PersonDto fromJson(JsonObject jsonPerson) throws InvalidInboundEntityException {
        var personDto = jsonPerson.mapTo(PersonDto.class);
        var errorBag = personDto.isValid();

        if (!errorBag.isEmpty()) {
            throw new InvalidInboundEntityException(errorBag);
        }

        return personDto;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
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
