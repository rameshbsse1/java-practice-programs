package com.example.test.corejava.threads;

import java.util.concurrent.*;

public class FutureSumCalculator implements Callable<Integer> {
    private  int n;

    public FutureSumCalculator(int n){
        this.n = n;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        int n= 10;
        FutureSumCalculator calculator = new FutureSumCalculator(n);
        Future<Integer> future = executor.submit(calculator);

        Integer result = future.get();
        System.out.println("sum of first numers"+ result);
        executor.shutdown();

    }
}
