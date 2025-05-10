package com.example.test.java8.Integeres;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SumTwoDim {

    public static void main(String[] args) {
        List<List<Integer>> multiList = Arrays.asList(Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8));

        int total = multiList.stream().flatMap(Collection::stream).reduce(Integer::sum).get();
        System.out.println(total);

        int totalSum = multiList.stream().flatMap(Collection::stream).mapToInt(Integer::intValue).sum();
        System.out.println(totalSum);

        int[][] arr = new int[][]{{1,2,3,4}, {5,6,7,8}};
        int arrTotalSum = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();
        System.out.println(arrTotalSum);
    }
}
