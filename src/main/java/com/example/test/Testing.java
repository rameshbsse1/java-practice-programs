package com.example.test;

import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        Logger logger = (Logger) LoggerFactory.getLogger(Testing.class);

        String str = "Iam an Indian";

        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        char result =  map.entrySet().stream().filter(entry -> entry.getValue()==1).map(Map.Entry :: getKey).findFirst().orElse((char) 0);
        System.out.println(result);

    }
}
