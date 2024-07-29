package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
public class CompletableFutureEj4 {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> randomNumber());
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> randomNumber());
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> randomNumber());
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> randomNumber());

        CompletableFuture<Object> firstCompleted = CompletableFuture.anyOf(future1, future2, future3, future4);

        firstCompleted.thenAccept(result -> {
            System.out.printf("El primer valor completado es: %s%n", result);
        }).join();
    }

    private static int randomNumber() {
        int randomNum = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return randomNum;
    }
}
