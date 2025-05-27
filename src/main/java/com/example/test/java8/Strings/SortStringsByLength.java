package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> friuts = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry","kiwi");

        friuts.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("------------");
        Collections.reverse(friuts);
        System.out.println("------------");
        friuts.forEach(System.out::println);
    }
}
