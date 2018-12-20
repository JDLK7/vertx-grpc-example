package com.bq.vertxgrpcexample.service.repository;

import com.bq.vertxgrpcexample.service.config.RedisConfig;
import com.bq.vertxgrpcexample.service.model.Person;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.vertx.core.json.JsonObject;
import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.core.eventbus.EventBus;

import java.util.List;

public class RedisRepository implements Repository<Person> {

    private EventBus eventBus;
    private RedisConfig redisConfig;
    private static final Byte MUTEX = 0;
    private static RedisRepository INSTANCE;

    private RedisRepository(Vertx vertx, RedisConfig redisConfig) {
        this.eventBus = vertx.eventBus();
        this.redisConfig = redisConfig;
    }

    public static RedisRepository getInstance(Vertx vertx, RedisConfig redisConfig) {
        if (INSTANCE == null) {
            synchronized (MUTEX) {
                if (INSTANCE == null) {
                    INSTANCE = new RedisRepository(vertx, redisConfig);
                }
            }
        }

        return INSTANCE;
    }

    @Override
    public Single<String> save(Person person) {
        var channel = redisConfig.getRedisChannelSet().orElse("redis.channel.set");

        eventBus.rxSend(channel, person.toJson());

        return Single.just(person.getId());
    }

    @Override
    public Maybe<Person> findById(String id) {
        var channel = redisConfig.getRedisChannelGet().orElse("redis.channel.get");

        return eventBus.rxSend(channel, id)
                .map(objectMessage -> (JsonObject) objectMessage.body())
                .filter(jsonPerson -> !jsonPerson.isEmpty())
                .map(jsonPerson -> jsonPerson.mapTo(Person.class));
    }

    @Override
    public Single<List<Person>> findAll() {
        return null;
    }

    @Override
    public Single<Person> update(Person person) {
        return null;
    }

    @Override
    public Completable delete(String id) {
        return null;
    }
}
