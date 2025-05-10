package com.example.test.corejava;

public class StringTricky {

    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "ja" + "va";
        System.out.println(s1 == s2); // true, compile time concatenation of literals results in the same object from SCP

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println();
        System.out.println(str1==str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true

        System.out.println();
        String a = "Ja";
        String b = "va";
        String c = a + b;
        String d = "Java";
        System.out.println(c == d); //false, Here, c is computed at runtime and is a new object

    }
}
