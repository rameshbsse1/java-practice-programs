package com.example.test.leetcode.easy;

public class StringPalindrome {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        int i =0;
        int j =str.length()-1;


        while(i< j) {

            while(i < j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static boolean isPalindromeUsingStringBuilder(String str) {
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String st = new StringBuilder(cleaned).reverse().toString();
        return st.equals(cleaned);

    }

    public static void main(String[] args) {
        System.out.println(StringPalindrome.isPalindrome("level"));
        System.out.println(StringPalindrome.isPalindrome("Racecar"));
        System.out.println(StringPalindrome.isPalindromeUsingStringBuilder("A man, a plan, a canal: Panama"));
        System.out.println(StringPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
