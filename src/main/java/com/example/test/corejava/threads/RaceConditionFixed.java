package com.example.test.corejava.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionFixed {
    static  int counter;

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static synchronized void incrementCounter() {
        counter++;
    }

    public static void incrementCounterUsingAtomic() throws InterruptedException {
        Runnable task = () -> {
            for (int i=0; i< 1000; i++){
                atomicInteger.getAndIncrement();
            }
        };
        Thread t1= new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Counter value using AtomicInteger..."+counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for(int i=0; i< 1000; i++){
                incrementCounter();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter);

        incrementCounterUsingAtomic();
    }
}
