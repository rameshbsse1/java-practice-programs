package com.example.test.java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDuplicatesFromAnInteger {
    public static void main(String[] args) {

        var  list = List.of(1,2,3,3,4,1,6,9,4);
        Set<Integer> numbers = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(numbers);
        System.out.println("--------------");

        list.stream().collect(Collectors.groupingBy((e->e), Collectors.counting()))
                .entrySet().stream().
                filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
