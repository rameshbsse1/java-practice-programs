package com.example.test.leetcode.easy;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValidParanthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c: str.toCharArray()) {
            if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if(c == '(')
                stack.push(')');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return  stack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "[{()[]}([)]";
        boolean result = ValidParanthesis.isValidParanthesis(str);
        System.out.println(result);
    }
}
