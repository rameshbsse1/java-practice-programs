package com.example.test.interview;

import java.util.Arrays;

public class AnagramCountInString {
    public static void main(String[] args) {
        String input = "bamxccdambedfmab";
        String target = "bam";
        StringBuilder sb = new StringBuilder();
        int matchIndex = 0;
        char[] targetArr = target.toCharArray();
        Arrays.sort(targetArr);

        for (int i=0; i< input.length(); i++) {
            char[] arr = input.toCharArray();
            if (target.contains(String.valueOf(arr[i]))) {
                sb.append(arr[i]);
            }

            if (!sb.isEmpty() && sb.length() ==  3) {
                char[] res = sb.toString().toCharArray();
                Arrays.sort(res);
                if (Arrays.equals(targetArr, res)) {
                    matchIndex++;
                }
                sb.setLength(0);
            }
        }

        System.out.println(matchIndex);
    }
}
