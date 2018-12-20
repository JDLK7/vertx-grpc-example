package com.bq.vertxgrpcexample.api.dto;

import com.bq.errorhandler.dtos.ErrorBag;

public class InboundPersonDto extends Dto {

    private String name;
    private String lastName;
    private String email;
    private int age;

    public InboundPersonDto() {
        super();

        this.name = "";
        this.lastName = "";
        this.email = "";
        this.age = -1;
    }

    public InboundPersonDto(String name, String lastName, String email, int age) {
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

    @Override
    public String toString() {
        return "InboundPerson{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
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
}
