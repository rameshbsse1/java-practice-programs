package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25, 2,3,4,5,6, 56, 7);

        OptionalInt optInt = list.stream().mapToInt(Integer::intValue).max();
        optInt.ifPresent(System.out::println);

        OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
        min.ifPresent(System.out::println);

        int[] arr = new int[] {25, 2,3,4,5,6, 56, 70};
        OptionalInt arrMax = Arrays.stream(arr).max();
        arrMax.ifPresent(System.out::println);
        OptionalInt arrMin = Arrays.stream(arr).min();
        arrMin.ifPresent(System.out::println);
    }

}
