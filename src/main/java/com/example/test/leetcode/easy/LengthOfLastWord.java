package com.example.test.leetcode.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove trailing and leading spaces
        int lastSpaceIndex = s.lastIndexOf(" ");
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Length of last word: " + lengthOfLastWord(input));
    }
}

