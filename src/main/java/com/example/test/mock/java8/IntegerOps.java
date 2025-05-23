package com.example.test.mock.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerOps {

    public static void main(String[] args) {
        var list  = Arrays.asList(2,3,4,5,6,9);

//square
        list.stream().map(n -> n*n).forEach(System.out::println);

//even, odd
        Map<Boolean, List<Integer>> hm = list.stream().collect(Collectors.partitioningBy(n ->n%2==0));
        System.out.println("Even nums: "+hm.get(true));
        System.out.println("Odd nums: "+hm.get(false));

// even and odd from a given range
        Map<Boolean, List<Integer>> hm1 = IntStream.rangeClosed(1,20).boxed().collect(Collectors.partitioningBy(num -> num%2==0));
        System.out.println("Even nums: "+hm1.get(true));
        System.out.println("Odd nums: "+hm1.get(false));

// Find max, min int
        list.stream().mapToInt(Integer::intValue).max().getAsInt();
        list.stream().mapToInt(Integer::intValue).min().getAsInt();

//Sum the values using parallel stream
        list.parallelStream().mapToInt(Integer::intValue).sum();

// remove the dup
        list.stream().distinct().forEach(System.out::println);

// 2nd largest
        Optional<Integer> optInt = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst();
        optInt.ifPresent(System.out::println);

// asc, desc order
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);

//sum of squares
        list.stream().map(num -> num*num).mapToInt(Integer::intValue).sum();

//sum and average
        list.stream().mapToInt(Integer::intValue).sum();
        list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();

//List<List<Integer>> sum
        //list.stream().flatMap(Collection::stream).mapToInt(Integer::intValue).sum();
    }
}
