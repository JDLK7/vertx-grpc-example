package com.bq.vertxgrpcexample.api.config;

import io.vertx.core.json.JsonObject;

import java.util.Optional;

/**
 * SharedConfig implements the methods needed to retrieve the app configuration. Each of the interfaces that implements
 * represents a set of configuration properties used in different parts of the codebase. In this way, we can keep those
 * parts as simple and descriptive as possible because they would receive only the configuration they actually need.
 * Every bit of configuration is returned as an Optional to avoiding the use of nulls and preventing possible errors.
 */
public class SharedConfig implements HttpServerConfig, DatabaseConfig, RedisConfig {

    /**
     * The JsonObject which contains the app configuration.
     */
    private JsonObject config;

    private static SharedConfig instance;
    private static final Byte LOCK = Byte.valueOf((byte)0);

    /**
     * @return a reference to the single instance of SharedConfig.
     */
    public static SharedConfig getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new SharedConfig();
                }
            }
        }

        return instance;
    }

    private SharedConfig() {}

    /**
     * Initializes the app configuration.
     * @param configInit JsonObject that contains the initial configuration
     */
    public void init(JsonObject configInit) {
        config = configInit;
    }

    /**
     * @return the configuration of the whole app.
     */
    public Optional<JsonObject> getConfig() {
        return Optional.of(config);
    }

    public  Optional<String> getContext(){
        return Optional.ofNullable(config.getString("service.context"));
    }

    @Override
    public  Optional<String> getHost(){
        return Optional.ofNullable(config.getString("http.host"));
    }

    @Override
    public  Optional<Integer> getPort(){
        return Optional.ofNullable(config.getInteger("http.port"));
    }

    @Override
    public  Optional<String> getServiceHost(){
        return Optional.ofNullable(config.getString("service.host"));
    }

    @Override
    public  Optional<Integer> getServicePort(){
        return Optional.ofNullable(config.getInteger("service.port"));
    }

    @Override
    public Optional<String> getDbName() {
        return Optional.ofNullable(config.getString("db.name"));
    }

    @Override
    public Optional<String> getDbPool() {
        return Optional.ofNullable(config.getString("db.pool"));
    }

    @Override
    public Optional<String> getRedisChannelGet() {
        return Optional.ofNullable(config.getString("redis.channel.get"));
    }

    @Override
    public Optional<String> getRedisChannelSet() {
        return Optional.ofNullable(config.getString("redis.channel.set"));
    }

    @Override
    public Optional<String> getRedisPassword() {
        return Optional.ofNullable(config.getString("redis.password"));
    }

    @Override
    public Optional<String> getRedisAddr() {
        return Optional.ofNullable(config.getString("redis.addr"));
    }

    @Override
    public Optional<Integer> getRedisPort() {
        return Optional.ofNullable(config.getInteger("redis.port"));
    }
}
