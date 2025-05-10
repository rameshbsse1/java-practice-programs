package com.example.test.java8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Jane", "Alice", "James");
        list.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }
}
