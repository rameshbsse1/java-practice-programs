package com.example.test.corejava;


public interface SumFunctionalInterface {
    abstract int sum(int a,int b);

    public static void main(String[] args) {
        SumFunctionalInterface s = (a,b) -> a+b;

        int result = s.sum(5,4);
        System.out.println(result);
    }
}

