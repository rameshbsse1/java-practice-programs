package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParallelStreamSum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Optional<Integer> listSum = list.parallelStream().map(num->num*num).reduce((x, y) -> x+y);
        listSum.ifPresent(System.out::println);

        int[] arr = new int[] {10,20,30,40,50};
        int arrSum = Arrays.stream(arr).parallel().map(num -> num*num).sum();
        System.out.println(arrSum);
    }


}
