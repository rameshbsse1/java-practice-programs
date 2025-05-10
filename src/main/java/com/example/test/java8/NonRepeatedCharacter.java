package com.example.test.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "I am an indian";

        char firstNonRepeatedChar = str.toLowerCase().chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse((char) 0);
        System.out.println(firstNonRepeatedChar);

        String modifiedStr = Arrays.stream(str.split(" ")).collect(Collectors.joining());

        modifiedStr.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key+ " "+value));

        str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                        .entrySet()
                        .stream()
                .filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst().orElse((char) 0);





        //System.out.println(nonRepeatedChar);


    }
}
