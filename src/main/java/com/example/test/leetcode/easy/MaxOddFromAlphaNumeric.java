package com.example.test.leetcode.easy;

public class MaxOddFromAlphaNumeric {

    public static void main(String[] args) {

        String str = "abc123def75gh2ij9kl237";
        StringBuilder sb = new StringBuilder();

        int maxOdd = -1;
        for (int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (!sb.isEmpty()) {
                    int num = Integer.parseInt(sb.toString());
                    if (num > maxOdd) {
                        maxOdd = num;
                    }
                }
                sb.setLength(0);
            }
        }

        if (!sb.isEmpty()) {
            int num = Integer.parseInt(sb.toString());
            if (num > maxOdd) {
                maxOdd = num;
            }
        }
        System.out.println(maxOdd);

    }
}
