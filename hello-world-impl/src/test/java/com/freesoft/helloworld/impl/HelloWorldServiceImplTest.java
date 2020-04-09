package com.freesoft.helloworld.impl;

import com.freesoft.helloworld.HelloWorldService;
import com.lightbend.lagom.javadsl.testkit.ServiceTest;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static com.lightbend.lagom.javadsl.testkit.ServiceTest.*;
import static com.lightbend.lagom.javadsl.testkit.ServiceTest.defaultSetup;
import static com.lightbend.lagom.javadsl.testkit.ServiceTest.withServer;
import static org.junit.Assert.assertEquals;

public class HelloWorldServiceImplTest {

    @Test
    public void testHelloWorldService() {
        withServer(defaultSetup(), server -> {
                    HelloWorldService helloWorldService = server.client(HelloWorldService.class);

                    String result = helloWorldService.helloWorld()
                            .invoke()
                            .toCompletableFuture()
                            .get();

                    assertEquals("Hello World!", result);
                }
        );

    }
}
