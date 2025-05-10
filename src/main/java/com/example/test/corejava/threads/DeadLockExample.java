package com.example.test.corejava.threads;

public class DeadLockExample {
    static  final Object lock1 = new Object();
    static  final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding Lock1...");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                System.out.println("Thread 1: Waiting for Lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired Lock2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
           synchronized (lock2) {
               System.out.println("Thread-2 holding lock2");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {

               }

                synchronized (lock1) {
                    System.out.println("Thread-2 holding lock1");
                }
           }
        });
        t1.start();
        t2.start();
    }

}




