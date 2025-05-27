package com.example.test.java8.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelStrings {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "sky", "pineapple", "myth", "strawberry", "try", "cry", "kiwi");
        fruits.stream().filter(str -> !str.matches(".*[aeiou].*")).forEach(System.out::println);

        String word = String.join(",", fruits);
        System.out.println("word :"+word);

    }
}
