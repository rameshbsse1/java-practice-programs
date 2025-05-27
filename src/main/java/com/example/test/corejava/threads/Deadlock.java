package com.example.test.corejava.threads;


public class Deadlock {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(lock1) {
                System.out.println("thrd1 holding lock1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
                synchronized(lock2) {
                    System.out.println("thrd1 holding acquiring lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(lock2) {
                System.out.println("thread2 holdin lock2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                synchronized(lock1) {
                    System.out.println("thread2 acquiring lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}