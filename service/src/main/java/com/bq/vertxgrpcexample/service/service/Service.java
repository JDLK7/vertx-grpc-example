package com.bq.vertxgrpcexample.service.service;

import io.reactivex.Maybe;
import io.reactivex.Single;

import java.util.List;

public interface Service<Model> {

    Single<String> create(Model model);

    Maybe<Model> retrieveOne(String id);

    Single<List<Model>> retrieveAll();

    Maybe<Model> update(String id, Model model);

    Maybe delete(String id);

}
