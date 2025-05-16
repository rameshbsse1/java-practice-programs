package com.example.test.java8.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> intPred = num -> num%2==0;
        Map<Boolean, List<Integer>> map = intList.stream().collect(Collectors.partitioningBy(intPred));
        List<Integer> evenList = map.get(true);
        List<Integer> oddList = map.get(false);
        System.out.println("Even :"+evenList);
        System.out.println("Odd: "+oddList);

        System.out.println("reverse--"+list.stream().map(str -> new StringBuffer(str).reverse()).toList());

        IntStream.range(0, list.size()).mapToObj(i -> list.get(list.size()-1-i)).forEach(System.out::println);
        Map<Boolean, List<Integer>> resList = intList.stream().collect(Collectors.partitioningBy(num-> num %2 ==0));
        System.out.println("--------------------------");
        System.out.println(resList.get(true));
        System.out.println(resList.get(false));
    }
}
