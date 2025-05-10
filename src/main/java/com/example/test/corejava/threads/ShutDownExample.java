package com.example.test.corejava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutDownExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable longTask = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + "Started");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + "Completed");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted");
            }
        };
        executorService.submit(longTask);
        executorService.submit(longTask);

        //executorService.shutdown();
        executorService.shutdownNow();

        if(!executorService.awaitTermination(6, TimeUnit.SECONDS)){
            System.out.println("Some tasks did not finish");
        } else {
            System.out.println("All tasks are finished");
        }
    }
}
