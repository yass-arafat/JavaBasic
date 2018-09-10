/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvanceBasic.Completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 *
 * @author Yassir Arafat
 */
public class Completablefuture {

    /**
     * DESCRIPTION: CompletableFuture is used for asynchronous programming in
     * Java. This way, your main thread does not block/wait for the completion
     * of the task and it can execute other tasks in parallel.
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // thenRun() example
        CompletableFuture<Void> completableFuture
                = CompletableFuture.supplyAsync(() -> {
                    // Run some computation  
                    return null; 
                }).thenRun(() -> {
                    // Computation Finished.
                });

// Block and get the result of the Future
//        String result = future.get();
//        System.out.println(result);
        System.out.println("prints");
    }

}
