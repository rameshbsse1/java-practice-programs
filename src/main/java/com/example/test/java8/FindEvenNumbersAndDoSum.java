package com.example.test.java8;

import java.util.List;

public class FindEvenNumbersAndDoSum {
    public static void main(String[] args) {
        var integerList = List.of(1,2,3,5,6,7,9,11,13);
        System.out.println(integerList.stream().filter(n -> n%2 ==0).toList());
        int sum = integerList.stream().filter(n -> n%2 ==0).mapToInt(Integer::intValue).sum();
        List<String> strList = integerList.stream().map(String::valueOf).toList();
        System.out.println("strList: "+strList);
        System.out.println(sum);
        System.out.println(integerList.stream().filter(e -> e%2 ==0).mapToInt(Integer::intValue).sum());
    }
}
