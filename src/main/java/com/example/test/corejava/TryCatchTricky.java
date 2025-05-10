package com.example.test.corejava;

public class TryCatchTricky {
    public static void main(String[] args) {

        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }

        System.out.println(test()); // finally overrides the one in try

        try {
            return;
        } finally {
            System.out.println("Finally block executed");
        }



    }

    public static int test() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
