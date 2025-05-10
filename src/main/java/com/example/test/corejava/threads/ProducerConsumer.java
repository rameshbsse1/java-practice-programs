package com.example.test.corejava.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumer {
    boolean flag = false;

    public synchronized void produce() throws InterruptedException {
        while (flag)
            wait();
        System.out.println("Produced..");
        Thread.sleep(500);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while(!flag)
            wait();
        System.out.println("Consumed..");
        Thread.sleep(500);
        notify();
    }


    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread producer = new Thread(() -> {
            for(int i=0; i<5; i++) {
                try {
                    producerConsumer.produce();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for(int i=0; i<5; i++) {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });
    }



}
