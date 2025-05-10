package com.example.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllUniqueNumberThatOccursOnlyOnce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> uniqueList = list.stream().filter(num ->Collections.frequency(list, num) == 1)
                .toList();
        System.out.println("Unique list "+uniqueList);

    }
}
