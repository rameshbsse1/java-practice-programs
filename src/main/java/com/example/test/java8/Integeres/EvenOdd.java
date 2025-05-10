package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 67,85, 43, 24 , 68, 71);

        //List
        list.stream().filter(num -> num %2 ==0).forEach(System.out::println);
        System.out.println();
        list.stream().filter(num-> num%2 !=0).forEach(System.out::println);
        System.out.println();
        //Arrays
        int[] arr = new int[] {12, 67,85, 43, 24 , 68, 71};
        Arrays.stream(arr).filter(num -> num%2==0).forEach(System.out::println);
        System.out.println();
        Arrays.stream(arr).filter(num-> num%2 !=0).forEach(System.out::println);

    }
}
