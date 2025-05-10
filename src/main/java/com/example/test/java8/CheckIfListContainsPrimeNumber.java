package com.example.test.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckIfListContainsPrimeNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 4,6,7,8,10,12,14,15);
        boolean containsPrime = list.stream().anyMatch(CheckIfListContainsPrimeNumber::isPrime);
        //list.stream().allMatch(n -> n%2 != 0).
        System.out.println(containsPrime);
    }



    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i=2; i <= number/2/*Math.sqrt(number)*/; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
