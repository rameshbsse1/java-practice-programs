package com.example.test.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterAndPrint {
    public static void main(String[] args) {
        String str = "Hexaware Technologies";

        str.trim().chars().filter(c -> c!= ' ').mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy((e->e), LinkedHashMap::new, Collectors.counting()))
                    .forEach((k, v) -> System.out.println(k +"->"+v));
        System.out.println("----------------------------");

         str.toLowerCase().chars().filter(c -> c!= ' ').mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k+ " "+v));
        str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy((e ->e), LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.print(k+ " "+v));
        System.out.println("---------------");

        str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy((e->e), LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+ " " +v));
        System.out.println("%%%%%%%%%%%%%");

        Map<Character, Long> charMap = str.chars().filter(c->c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        e -> e,
                        LinkedHashMap::new,
                        Collectors.counting()));
        System.out.println(charMap);
        for(Map.Entry<Character, Long> entry: charMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
