package com.example.test.corejava;

public class StringPermutations {

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("All permutations of " + input + " are:");
        printPermutations("", input);
    }

    private static void printPermutations(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; i++) {
            printPermutations(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1)
            );
        }
    }
}

