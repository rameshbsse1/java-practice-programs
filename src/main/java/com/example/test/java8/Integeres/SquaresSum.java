package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;

public class SquaresSum {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2,3,4,5);
        int squareSum = numList.stream().map(num -> num*num).mapToInt(Integer::intValue).sum();
        System.out.println(squareSum);

        int[] arr =new int[] {2,3,4,5};
        int arrSum = Arrays.stream(arr).map(num -> num*num).sum();
        System.out.println(arrSum);
    }
}
