package com.bq.vertxgrpcexample.service.config;

import java.util.Optional;

public interface HttpServerConfig {

    Optional<String> getHost();

    Optional<Integer> getPort();

}
