package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(key-> key, num-> num*num));
        map.forEach((key, val) -> System.out.println(key+ " "+val));
        System.out.println();

        int[] arr = new int[] {1,2,3,4,5,6};
        Arrays.stream(arr).boxed().collect(Collectors.toMap(key->key, val->val*val))
                .forEach((k,v)-> System.out.println(k+" "+v));
    }
}
