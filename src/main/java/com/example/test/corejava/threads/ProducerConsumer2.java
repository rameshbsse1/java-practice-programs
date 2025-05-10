package com.example.test.corejava.threads;

public class ProducerConsumer2 {
    private  int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available)
            wait();
        data = value;
        available=true;
        System.out.println("Produced..");
        notify();
    }

    public synchronized void consume() throws InterruptedException{
        while (!available)
            wait();
        available = false;
        System.out.println("Consumed..");
        notify();
    }

    public static void main(String[] args) {
        ProducerConsumer2 buffer = new ProducerConsumer2();
        Thread producer = new Thread(() -> {
            int value = 1;
            try{
                for(int i=0; i< 5; i++) {
                    buffer.produce(value++);
                    System.out.println(value);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    buffer.consume();
                    System.out.println();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();
    }
}
