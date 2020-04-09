package com.freesoft.helloworld.impl;

import akka.NotUsed;
import com.freesoft.helloworld.HelloWorldService;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class HelloWorldServiceImpl
        implements HelloWorldService {

    @Override
    public ServiceCall<NotUsed, String> helloWorld() {
        return notUsed -> completedFuture("Hello World!");
    }
}
