package com.example.test.java8.Integeres;

import com.example.test.java8.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(65,21,43,87,91,12,15,25);
        list.stream().sorted(Comparator.comparing(Integer::valueOf)).forEach(System.out::println);
        System.out.println("-----");
        list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);

        //find sum and avrage
        int total = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(total);
        Optional<Integer> optInt = list.stream().reduce(Integer::sum);
        optInt.ifPresent(System.out::println);

        OptionalDouble optDouble = list.stream().mapToDouble(Integer::doubleValue).average();
        optDouble.ifPresent(System.out::println);
        System.out.println("------");

        //Arrays
        Integer[] arr = {65,21,43,87,91,12,15,25};
        int arrayTotal = Arrays.stream(arr).mapToInt(Integer::intValue).sum();
        System.out.println(arrayTotal);

        OptionalDouble optionalDoubleforArr = Arrays.stream(arr).mapToDouble(Integer::doubleValue).average();
        optionalDoubleforArr.ifPresent(System.out::println);

        //find max and min - List
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max: "+max);

        int maxValue = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("max value: "+maxValue);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min: "+min);

        int minValue = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("min value: "+minValue);

        //get the even or add numbers from the given list and array

        //List
        List<Integer> numList = Arrays.asList(65,22,43,87,91,12,16,25);
        numList.stream().collect(Collectors.partitioningBy(num -> num %2 ==0)).forEach((k, v) -> System.out.println(k +" "+v));
       Map<Boolean, List<Integer>> oddEvenList = numList.stream().collect(Collectors.partitioningBy(num -> num %2 ==0));
      // or
       System.out.println("even list: "+oddEvenList.get(true));
        System.out.println("odd list: "+oddEvenList.get(false));

        //Array
        int[] numArr = new int[] {65,22,43,87,91,12,16,25};
        Arrays.stream(numArr).boxed().collect(Collectors.partitioningBy(num -> num%2 ==0)).forEach((k, v)-> System.out.println(k+" "+v));

        //get the even or add numbers between a range
        // List
        Map<Boolean, List<Integer>> oddEvenMapoddEvenMap = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.partitioningBy(num -> num%2 ==0));
        System.out.println("Even-->"+oddEvenMapoddEvenMap.get(true));
        System.out.println("Odd-->"+oddEvenMapoddEvenMap.get(false));

        //sort a list of integers in descending or ascending order
        numList.stream().sorted().forEach(System.out::println);
        numList.stream().sorted((a, b)-> b-a).forEach(System.out::println);
        //or
        numList.stream().sorted(Comparator.comparing(Integer::valueOf)).forEach(System.out::println);
        numList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);

        //Arrays
        Arrays.stream(numArr).sorted().forEach(System.out::println);
        Arrays.stream(numArr).boxed().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);


        //calculate the sum and average of numbers in a list of integers and in Array of integers


        //Find the max and min number in List of integers and Array of integers










    }
}
