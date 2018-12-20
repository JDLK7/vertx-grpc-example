package com.bq.vertxgrpcexample.service.repository;

import com.bq.vertxgrpcexample.service.config.SharedConfig;
import com.bq.vertxgrpcexample.service.converter.PersonConverter;
import com.bq.vertxgrpcexample.service.proto.Person;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.vertx.core.json.JsonObject;
import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.ext.mongo.MongoClient;

import java.util.List;
import java.util.Objects;

import static com.bq.vertxgrpcexample.service.model.Person.COLLECTION_NAME;

public class MongoDbRepository implements Repository<Person>, PersonConverter {

    private static final Byte LOCK = 0;

    private static MongoClient client;
    private static MongoDbRepository instance;

    private MongoDbRepository(Vertx vertx, SharedConfig sharedConfig) {
        var dbConfig = new JsonObject().put("db_name", sharedConfig.getDbName().orElse("default_db_name"));
        var dbPoolName = sharedConfig.getDbPool().orElse("default_db_pool");

        client = MongoClient.createShared(vertx, dbConfig, dbPoolName);
    }

    public static MongoDbRepository getInstance(Vertx vertx, SharedConfig sharedConfig) {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new MongoDbRepository(vertx, sharedConfig);
                }
            }
        }
        return instance;
    }

    @Override
    public Single<String> save(Person person) {
        return client.rxInsert(COLLECTION_NAME, messageToJson(person));
    }

    @Override
    public Maybe<Person> findById(String id) {
        var query = new JsonObject()
                .put("_id", id);

        return client.rxFindOne(COLLECTION_NAME, query, null)
                .filter(Objects::nonNull)
                .map(this::jsonToMessage);
    }

    @Override
    public Single<List<Person>> findAll() {
        return client.rxFind(COLLECTION_NAME, new JsonObject())
                .map(this::jsonListToMessageList);
    }

    @Override
    public Single<Person> update(Person person) {
        var query = new JsonObject()
                .put("_id", person.getId());

        return client.rxReplace(COLLECTION_NAME, query, messageToJson(person))
                .toSingleDefault(person);
    }

    @Override
    public Completable delete(String id) {
        var query = new JsonObject()
                .put("_id", id);

        return client.rxRemove(COLLECTION_NAME, query);
    }

}
