package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class CompletableFutureEj3 {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> randomNumber());
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> randomNumber());
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> randomNumber());
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> randomNumber());

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3, future4);

        CompletableFuture<Integer> futureSum = allFutures.thenApply(v -> {
            try {
                return future1.get() + future2.get() + future3.get() + future4.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.printf("La suma de los numeros aleatorios es: %s%n", futureSum.get());
    }

    public static int randomNumber() {
     Random random = new Random();
     try {
         Thread.sleep(4000);
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }
        return random.nextInt(100,501);
    }
}
