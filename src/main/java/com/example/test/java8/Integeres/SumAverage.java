package com.example.test.java8.Integeres;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6, 7);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        Optional<Integer> optSum = list.stream().reduce(Integer::sum);
        optSum.ifPresent(System.out::println);

        OptionalDouble avg = list.stream().mapToDouble(Integer::doubleValue).average();
        avg.ifPresent(System.out::println);

        // Arrays
        int[] arr = new int[] {2,3,4,5,6};
        System.out.println();
        int arrSum = Arrays.stream(arr).sum();
        System.out.println(arrSum);

        OptionalDouble arrAvg = Arrays.stream(arr).boxed().mapToDouble(Integer::doubleValue).average();
        arrAvg.ifPresent(System.out::println);
    }
}
