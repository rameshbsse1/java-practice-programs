package com.example.test.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectUniqueExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
        list.stream().collect(Collectors.toSet());
    }
}
