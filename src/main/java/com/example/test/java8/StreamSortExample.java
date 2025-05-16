package com.example.test.java8;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,8,1,3);
        System.out.println(list.stream().sorted().toList());

        String str = "Hexaware Technologies";

        for (int i=0; i< str.length(); i++) {
            if("aeiou".indexOf(str.charAt(i)) != -1){
                System.out.println("first vowel: "+str.charAt(i));
                break;
            }
        }


    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
