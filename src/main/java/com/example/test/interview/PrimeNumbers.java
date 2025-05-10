package com.example.test.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .filter(n -> n>1 && IntStream.rangeClosed(2, n/2)
                        .allMatch(i -> n%i !=0))
                .forEach(System.out::println);
        String str = "I am an indian";
        char firstNnRepeateChar = str.toLowerCase().chars().filter(c -> c!=' ').mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse((char) 0);
        System.out.println(firstNnRepeateChar);

        IntStream.rangeClosed(1, 100).filter(n -> n>1 && IntStream.rangeClosed(2, n/2).allMatch(i -> n%i != 0)).forEach(System.out::println);

        IntStream.rangeClosed(1,100).filter(n -> n>1 && IntStream.rangeClosed(2, n/2).allMatch(i -> n%i != 0)).forEach(System.out::println);

    }
}
