package com.bq.vertxgrpcexample.service.repository;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InMemoryRepository<T> implements Repository<T> {

    private List<T> entities = new ArrayList<>();
    private ExecutorService executor = Executors.newFixedThreadPool(1);

    @Override
    public Single<String> save(T entity) {
        Single<T> personEmiter = Single.create(emitter -> {
            try {
                entities.add(entity);
                emitter.onSuccess(entity);
            } catch (Exception ex) {
                emitter.onError(ex);
            }
        });

        return personEmiter.subscribeOn(Schedulers.from(executor)).map(t -> t.toString());
    }

    @Override
    public Maybe<T> findById(String id) {
        return null;
    }

    @Override
    public Single<List<T>> findAll() {
        Single<List<T>> personEmitter = Single.create(emitter -> {
            emitter.onSuccess(entities);
        });

        return personEmitter.subscribeOn(Schedulers.from(executor));
    }

    @Override
    public Single<T> update(T entity) {
        return null;
    }

    @Override
    public Completable delete(String id) {
        return null;
    }
}
