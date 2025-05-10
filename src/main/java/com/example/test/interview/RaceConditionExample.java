package com.example.test.interview;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RaceConditionExample {
    static int counter = 0;

    public static synchronized void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
      /*  Runnable task = () -> {
            for (int i=0; i<1000; i++) {
                counter++;
                //incrementCounter();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("counter: "+counter);*/


        Runnable task1 = () -> {
            for (int i=0; i<1000; i++) {
                counter++;
            }
        };

        Thread t12 = new Thread(task1);
        Thread t13 = new Thread(task1);
        t12.start();
        t13.start();

        t12.join();
        t13.join();
        System.out.println(counter);

        var list = List.of(1,2,2,3,4,5,5,6,8,8,0);

        Set<Integer> dupIntList = list.stream().collect(Collectors.groupingBy(n ->n, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(dupIntList);

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

        var strList = List.of("Ramesh", "Ravi","Kiran", "Govind", "Kranthi");
        Map<Character, List<String>> map = strList.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
        //map.forEach((k,v)-> System.out.println(k+" "+v));

        Map<Character, List<String>> sortedMap = strList.stream()
                .collect(Collectors.groupingBy(word -> Character.toLowerCase(word.charAt(0)), TreeMap::new, Collectors.toList()));
        sortedMap.forEach((k, v) -> System.out.println(k+" "+v));

    }
}
