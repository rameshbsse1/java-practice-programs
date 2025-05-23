package com.example.test.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String str = "java technology java is robust and this technology is evolving";
        Map<String, Integer> hm = new HashMap<>();
        String[] arr = str.split(" ");
        for (String s: arr) {
            hm.put(s, hm.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
            if (entry.getValue()>1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            //System.out.println();
        }

        List<String> list = List.of(str.split(" "));
        list.stream().collect(Collectors.groupingBy(word-> word, Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1)
                .forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));

    }
}
