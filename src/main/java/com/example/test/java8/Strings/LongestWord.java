package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry","kiwi");
        Optional<String> optStr = fruits.stream().max(Comparator.comparing(String::length));
        optStr.ifPresent(System.out::println);
    }
}
