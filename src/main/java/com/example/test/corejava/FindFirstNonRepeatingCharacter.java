package com.example.test.corejava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for(char c: str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue()==1) {
                return entry.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String str = "i am an indian";
        char result = findFirstNonRepeatingChar(str);
        System.out.println(result);
    }
}
