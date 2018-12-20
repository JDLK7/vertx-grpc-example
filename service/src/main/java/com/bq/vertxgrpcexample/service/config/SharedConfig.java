package com.bq.vertxgrpcexample.service.config;

import io.vertx.core.json.JsonObject;

import java.util.Optional;

public class SharedConfig implements HttpServerConfig, DatabaseConfig, RedisConfig {

    private JsonObject config;

    private static SharedConfig instance;
    private static final Byte LOCK = Byte.valueOf((byte)0);

    // Thread safe singleton implementation
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

    public void init(JsonObject configInit) {
        config = configInit;
    }

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
