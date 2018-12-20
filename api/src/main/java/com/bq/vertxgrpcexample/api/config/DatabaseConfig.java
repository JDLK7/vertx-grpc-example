package com.bq.vertxgrpcexample.api.config;

import java.util.Optional;

public interface DatabaseConfig {

    Optional<String> getDbName();

    Optional<String> getDbPool();

}
