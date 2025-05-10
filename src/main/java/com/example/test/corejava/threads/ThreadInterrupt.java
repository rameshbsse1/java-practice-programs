package com.example.test.corejava.threads;

public class ThreadInterrupt {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("1-"+Thread.currentThread().getName());
                Thread.sleep(10);

            } catch (InterruptedException e) {
                System.out.println("4-"+Thread.currentThread().getName());
                System.out.println("Thread was interrupted");
                System.out.println("5-"+Thread.currentThread().getName());
            }
        });
        System.out.println("2-"+Thread.currentThread().getName());
        t.start();
        System.out.println("3-"+Thread.currentThread().getName());
        t.interrupt(); // Sends interrupt signal
    }
}
