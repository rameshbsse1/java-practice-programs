package com.example.test.java8.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortListOfStringsAndPrint {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "orange" ,"berry", "banana", "pineapple", "berry", "apple", "try");
        list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

        List<String> list1 = list.stream().filter(e -> e.length()>5).collect(Collectors.toList());
        System.out.println(list1);

        List<String> dupList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(dupList);

       List<String> specificStrList = list.stream().filter(e -> !e.startsWith("a")).collect(Collectors.toList());
        System.out.println(specificStrList);

        String firstEle = list.stream().filter(e -> e.startsWith("b")).findFirst().orElse("default");
        System.out.println(firstEle);

        System.out.println(list.stream().map(String::length).toList());

        Predicate<String> pred = str -> str.matches(".*[aeiou].*");
        list.stream().collect(Collectors.partitioningBy(pred)).forEach((key, value) ->{
            System.out.println(key+" "+value);
        });
    }
}
