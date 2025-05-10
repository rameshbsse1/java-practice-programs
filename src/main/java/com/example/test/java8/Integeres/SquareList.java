package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2, 3, 4, 5);
        numList.stream().map(num -> num*num).forEach(System.out::println);
        System.out.println();

        int[] arr = new int[] {2, 3, 4, 5};
        Arrays.stream(arr).map(num -> num* num).forEach(System.out::println);
    }
}
