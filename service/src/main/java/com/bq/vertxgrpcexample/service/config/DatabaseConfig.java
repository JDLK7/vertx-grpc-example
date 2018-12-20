package com.bq.vertxgrpcexample.service.config;

import java.util.Optional;

public interface DatabaseConfig {

    Optional<String> getDbName();

    Optional<String> getDbPool();

}
