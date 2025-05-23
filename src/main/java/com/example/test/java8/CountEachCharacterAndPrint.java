package com.example.test.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterAndPrint {
    public static void main(String[] args) {
        String str = "Hexaware Technologies";

        str.trim().chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy((e->e), LinkedHashMap::new, Collectors.counting()))
                    .forEach((k, v) -> System.out.println(k +"->"+v));
        System.out.println("----------------------------");
    }
}
