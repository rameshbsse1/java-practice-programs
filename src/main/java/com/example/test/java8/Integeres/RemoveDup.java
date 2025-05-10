package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;

public class RemoveDup {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25,2,3,4,25,56,56,7);
        list.stream().distinct().forEach(System.out::println);
        System.out.println();

        int[] arr  =new int[] {25,2,3,4,25,56,56,7};
        Arrays.stream(arr).distinct().forEach(System.out::println);
    }
}
