package com.example.test.corejava.threads;

public class DeadLockFixed {

    final static Object lock1 = new Object();
    final static Object lock2 = new Object();

    public static void main(String[] args) {
        Runnable task = () ->{
            synchronized (lock1) {
                System.out.println("holding lock1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                synchronized (lock2){
                    System.out.println("aquired of Lock2");
                }
            }

        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
