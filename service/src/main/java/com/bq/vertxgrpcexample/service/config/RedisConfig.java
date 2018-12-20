package com.bq.vertxgrpcexample.service.config;

import java.util.Optional;

/**
 * RedisConfig interface contains the methods that must be implemented in order to retrieve
 * the configuration of your redis server. This could be: host, port, password...
 * Feel free to add the configuration needed for your Redis server.
 */
public interface RedisConfig {

    Optional<String> getRedisChannelGet();
    Optional<String> getRedisChannelSet();
    Optional<String> getRedisPassword();
    Optional<String> getRedisAddr();
    Optional<Integer> getRedisPort();

}
