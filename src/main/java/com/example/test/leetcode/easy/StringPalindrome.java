package com.example.test.leetcode.easy;

public class StringPalindrome {

    public static boolean isPolindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        int i =0;
        int j =str.length()-1;

        while(i< j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(StringPalindrome.isPolindrome("level"));
        System.out.println(StringPalindrome.isPolindrome("Racecar"));
    }
}
