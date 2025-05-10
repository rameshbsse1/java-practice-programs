package com.example.test.java8;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6);
        System.out.println(list.stream().reduce(0, Integer::sum));
    }
}
