package com.example.test.java8.Integeres;

import java.util.stream.IntStream;

public class EvenOddRange {
    public static void main(String[] args) {
        IntStream.rangeClosed(10, 20).filter(num -> num %2 ==0).forEach(System.out::println);
        System.out.println();
        IntStream.rangeClosed(10, 20).filter(num->num%2!=0).forEach(System.out::println);
    }
}
