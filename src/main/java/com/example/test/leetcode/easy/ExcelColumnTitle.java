package com.example.test.leetcode.easy;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Shift to 0-based (because A=1 in Excel but 0-based in code)
            int remainder = columnNumber % 26;
            char currentChar = (char) ('A' + remainder);
            sb.insert(0, currentChar); // prepend character
            columnNumber = columnNumber / 26;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));    // A
        System.out.println(convertToTitle(28));   // AB
        System.out.println(convertToTitle(701));  // ZY
        System.out.println(convertToTitle(702));  // ZZ
        System.out.println(convertToTitle(703));  // AAA
    }
}

