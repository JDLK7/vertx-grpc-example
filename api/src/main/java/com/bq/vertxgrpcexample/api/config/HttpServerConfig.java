package com.bq.vertxgrpcexample.api.config;

import java.util.Optional;

public interface HttpServerConfig {

    Optional<String> getHost();

    Optional<Integer> getPort();

}
