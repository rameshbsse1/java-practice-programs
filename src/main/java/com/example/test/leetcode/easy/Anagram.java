package com.example.test.leetcode.easy;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        s1 = s1.toLowerCase();
        s2= s2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i=0; i<s1.length();i++ )
        {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }


        // Approach2
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Array equals: "+Arrays.equals(arr1, arr2));



        return true;
    }

    public static void main(String[] args) {
        boolean result = Anagram.isAnagram("Debit Card ", "Bad Credit");
        System.out.println(result);

    }
}
