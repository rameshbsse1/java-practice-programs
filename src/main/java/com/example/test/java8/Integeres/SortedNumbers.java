package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 67,85, 43, 24 , 68, 71);
        list.stream().sorted().forEach(System.out::println);
        System.out.println();
        list.stream().sorted((a, b) -> b-a).forEach(System.out::println);
        System.out.println();
        list.stream().sorted(Comparator.comparing(Integer::valueOf)).forEach(System.out::println);
        System.out.println();
        list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);

        //Arrays
        int[] arr = new int[] {12,67,85,43,24,68,71};
        System.out.println("---Arrays---");
        Arrays.stream(arr).boxed().sorted().forEach(System.out::println);
        System.out.println();
        Arrays.stream(arr).boxed().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);
    }
}
