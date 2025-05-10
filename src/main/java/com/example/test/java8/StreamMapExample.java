package com.example.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "microservices");
        System.out.println(list.stream().map(String::toUpperCase).toList());

    }
}
