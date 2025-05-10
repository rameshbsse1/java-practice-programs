package com.example.test.corejava;

public class FibonacciByRecursion {

    public static void fibonacciByUsingLoop(int n) {
        int n1 =0, n2 = 1;
        for (int i=0; i<n; i++) {
            System.out.print(n1+ " ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
    }

    public static int fibonacciByRecursion(int n) {
        if (n<1)
            return n;
        return fibonacciByRecursion(n-1) + fibonacciByRecursion(n-2);
    }

    public static void main(String[] args) {
        fibonacciByUsingLoop(10);
        for (int i=0; i<3; i++) {
            //System.out.print(fibonacciByRecursion(i));
        }

    }
}
