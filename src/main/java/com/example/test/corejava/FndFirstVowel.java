package com.example.test.corejava;

public class FndFirstVowel {
    public static void main(String[] args) {
        String str = "Rmesh";

        // Approach -1
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if ("aeiou".contains(String.valueOf(c))) {
                System.out.println("first vowel is :" + c);
                break;
            }
        }

        //Approach-2
        for(int i=0; i< str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                System.out.println("first vowel from string: "+ str.charAt(i));
                break;
            }
        }
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

}
