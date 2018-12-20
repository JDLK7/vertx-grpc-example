package com.bq.vertxgrpcexample.service;

import com.bq.vertxgrpcexample.service.verticles.MainVerticle;
import com.bq.vertxgrpcexample.service.verticles.Runner;

public class Main {

    public static void main(String[] args) {
        Runner.run(MainVerticle.class);
    }

}
