package com.example.test.java11;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiLine {
    public static void main(String[] args) {
        String str = "Java\nPython\nGo";
        str.lines().forEach(System.out::println);

        System.out.println("test".repeat(3));

        int[] numbers = {10, 20, 5, 8, 30, 20, 30, 15};
        List<Integer> intList = Arrays.stream(numbers).boxed().toList();

        Optional<Integer> optInt = intList.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst();
        System.out.println("---------");
        optInt.ifPresent(System.out::println);

        //List<Integer> list = Arrays.asList(numbers);

        List<Integer> list = Arrays.asList(10, 20, 5, 8, 30, 15);
        System.out.println();
        Optional<Integer> result = list.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst();
        result.ifPresent(System.out::println);

        Optional<Integer> res = list.stream().distinct().sorted((a, b) -> b-a).skip(1).findFirst();
        res.ifPresent(System.out::println);
    }
}
