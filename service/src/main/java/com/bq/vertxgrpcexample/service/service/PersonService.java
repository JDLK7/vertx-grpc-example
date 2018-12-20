package com.bq.vertxgrpcexample.service.service;

import com.bq.sdk.api.proto.*;
import com.bq.vertxgrpcexample.service.repository.Repository;
import io.vertx.core.Future;

import java.util.UUID;

public class PersonService extends PersonServiceGrpc.PersonServiceVertxImplBase {

    private static final Byte LOCK = 0;

    private Repository<Person> repository;

    private static PersonService instance;

    private PersonService(Repository repository) {
        this.repository = repository;
    }

    public static PersonService getInstance(Repository repository) {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new PersonService(repository);
                }
            }
        }

        return instance;
    }

    @Override
    public void createPerson(Person person, Future<Person> response) {
        var uuid = UUID.randomUUID().toString();

        var personToSave = Person.newBuilder(person)
                .setId(uuid)
                .build();

        repository.save(personToSave).subscribe(id -> response.complete(personToSave));
    }

    @Override
    public void fetchPerson(FetchPersonRequest request, Future<Person> response) {
        repository.findById(request.getId())
                .doOnSuccess(response::complete)
                .doOnComplete(response::complete)
                .subscribe();
    }

    @Override
    public void fetchAll(FetchAllRequest request, Future<FetchAllResponse> response) {
        var fetchAllRespBuilder = FetchAllResponse.newBuilder();

        repository.findAll()
                .subscribe(people -> response.complete(fetchAllRespBuilder.addAllPeople(people).build()));
    }

    @Override
    public void updatePerson(Person request, Future<Person> response) {

    }

    @Override
    public void deletePerson(Person request, Future<DeleteResponse> response) {

    }

}
