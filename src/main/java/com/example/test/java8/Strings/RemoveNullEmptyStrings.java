package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.List;

public class RemoveNullEmptyStrings {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "", "pineapple", "", "strawberry", null, "berry","kiwi");
        fruits.stream().filter(s -> s!= null && !s.isEmpty()).forEach(System.out::println);
    }
}
