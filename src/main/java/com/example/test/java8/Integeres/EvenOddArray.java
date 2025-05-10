package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> map =list.stream().collect(Collectors.partitioningBy(num -> num%2==0));
        System.out.println("Even :"+map.get(true));
        System.out.println("Odd :"+map.get(false));

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        Map<Boolean, List<Integer>> arrMap = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(num -> num%2 ==0));
        System.out.println("Arr even :"+arrMap.get(true));
        System.out.println("Arr odd :"+arrMap.get(false));
    }
}
