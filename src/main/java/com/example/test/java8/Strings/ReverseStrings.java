package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.List;

public class ReverseStrings {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry","kiwi");

        fruits.stream().map(str -> new StringBuilder(str).reverse()).forEach(System.out::println);

    }
}
