package com.example.test.java8;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,8,1,3);
        System.out.println(list.stream().sorted().toList());
    }
}
