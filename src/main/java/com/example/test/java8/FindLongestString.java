package com.example.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "grapefruit");

        System.out.println(list.stream().max(Comparator.comparingInt(String::length)).get());

    }
}
