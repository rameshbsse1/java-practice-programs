package com.example.test.leetcode.easy;

public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));    // 1
        System.out.println(titleToNumber("Z"));    // 26
        System.out.println(titleToNumber("AA"));   // 27
        System.out.println(titleToNumber("AB"));   // 28
        System.out.println(titleToNumber("ZY"));   // 701
        System.out.println(titleToNumber("AAA"));  // 703
    }
}

