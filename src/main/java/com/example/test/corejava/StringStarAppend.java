package com.example.test.corejava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStarAppend {
    public static void main(String[] args) {
        String str = "abc1def2xyz3";

        StringBuilder sb = new StringBuilder();
        for (int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (ch == '1') {
                    sb.append("*");
                } else if (ch == '2') {
                    sb.append("**");
                } else if (ch =='3'){
                    sb.append("***");
                }
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }


}
