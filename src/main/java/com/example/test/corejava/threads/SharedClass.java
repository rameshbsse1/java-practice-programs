package com.example.test.corejava.threads;

public class SharedClass {

    boolean flag = false;

    public synchronized void produce() throws InterruptedException {
        while (flag)
            wait();
        System.out.println("Produced..");
        flag = true;
        notify();
    }

    public synchronized void concume() throws InterruptedException {
        while (!flag)
            wait();
        System.out.println("Consumed..");
        flag = false;
        notify();
    }

    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();
        Thread producer = new Thread(() -> {
            for (int i=0;i<3; i++) {
                try {
                    sharedClass.produce();
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i=0; i<3; i++) {
                try {
                    sharedClass.concume();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }


}
