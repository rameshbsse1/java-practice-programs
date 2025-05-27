package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry","kiwi");

        Map<Integer, List<String>> map = fruits.stream().collect(Collectors.groupingBy(String::length));
        map.forEach((k,v) -> System.out.println(k+" "+v));

    }
}
