package com.example.test.corejava;

import java.util.Arrays;

public class ReverseAString {

    public static String reverseString(String input) {
        StringBuilder result = new StringBuilder();
        for (int i=input.length()-1; i>=0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    public static String reverseStringWithOutUsingBuiltInMethod(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length-1;
        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++; right--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "I am an indian";
        System.out.println(ReverseAString.reverseString("I am an Indian"));
        String result = reverseStringWithOutUsingBuiltInMethod(str);
        System.out.println("res--"+result);
    }
}
