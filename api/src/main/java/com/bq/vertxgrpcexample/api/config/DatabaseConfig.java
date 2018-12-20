package com.bq.vertxgrpcexample.api.config;

import java.util.Optional;

/**
 * DatabaseConfig interface contains the methods that must be implemented in order to retrieve
 * the configuration of your database. This could be: name, host, port, user, password...
 * Feel free to add the configuration needed for your DB server.
 */
public interface DatabaseConfig {

    Optional<String> getDbName();

    Optional<String> getDbPool();

}
