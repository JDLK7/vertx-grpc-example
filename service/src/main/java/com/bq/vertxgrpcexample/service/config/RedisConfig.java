package com.bq.vertxgrpcexample.service.config;

import java.util.Optional;

public interface RedisConfig {

    Optional<String> getRedisChannelGet();
    Optional<String> getRedisChannelSet();
    Optional<String> getRedisPassword();
    Optional<String> getRedisAddr();
    Optional<Integer> getRedisPort();

}
