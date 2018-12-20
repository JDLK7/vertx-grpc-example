package com.bq.vertxgrpcexample.service.repository;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

import java.util.List;

public interface Repository<Model> {

    Single<String> save(Model model);

    Maybe<Model> findById(String id);

    Single<List<Model>> findAll();

    Single<Model> update(Model model);

    Completable delete(String id);

}
