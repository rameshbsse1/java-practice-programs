package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        Optional<Integer> secondLargest = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst();
        secondLargest.ifPresent(System.out::println);

        Optional<Integer> secondSmallest = list.stream().sorted().skip(1).findFirst();
        secondSmallest.ifPresent(System.out::println);
        System.out.println();

        list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().ifPresent(System.out::println);

    }
}
