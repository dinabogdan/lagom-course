package com.freesoft.helloworld.impl;

import com.freesoft.helloworld.HelloWorldService;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

public class HelloWorldServiceImplTest {

    @Test
    public void testHelloWorldService() throws ExecutionException, InterruptedException {
        HelloWorldService helloWorldService = new HelloWorldServiceImpl();

        String result = helloWorldService.helloWorld()
                .invoke()
                .toCompletableFuture()
                .get();

        assertEquals("Hello World!", result);
    }
}
