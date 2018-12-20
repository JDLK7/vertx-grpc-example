package com.bq.vertxgrpcexample.service.repository;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

import java.util.List;

/**
 * Generic interface that defines the basic operations a repository
 * should implement for managing the persistence in a database.
 * The methods utilize RxJava Single, Maybe and Completable
 * in order to allow a reactive behaviour.
 * @param <Model>
 */
public interface Repository<Model> {

    /**
     * Creates the given Model in the database and returns its ID.
     * @param model
     * @return
     */
    Single<String> save(Model model);

    /**
     * Retrieves (if exists) a Model given its ID.
     * @param id
     * @return
     */
    Maybe<Model> findById(String id);

    /**
     * Retrieves all of the models saved in the database.
     * @return
     */
    Single<List<Model>> findAll();

    /**
     * Updates a Model and returns the result of the operation.
     * @param model
     * @return
     */
    Single<Model> update(Model model);

    /**
     * Deletes a Model from the database given its ID and returns a Completable
     * that will complete if the operation is successful.
     * @param id
     * @return
     */
    Completable delete(String id);

}
