package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLetter {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry","kiwi");

        Map<Character, List<String>> charMap = fruits.stream().collect(Collectors.groupingBy(word-> word.charAt(0)));
        charMap.forEach((k,v) -> System.out.println(k+" "+v));
    }
}
