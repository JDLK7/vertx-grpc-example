package com.bq.vertxgrpcexample.api;

import com.bq.vertxgrpcexample.api.verticles.MainVerticle;
import com.bq.vertxgrpcexample.api.verticles.Runner;

public class Main {

    public static void main(String[] args) {
        Runner.run(MainVerticle.class);
    }

}
