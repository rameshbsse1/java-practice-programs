package com.example.test.java11;

import java.util.List;

public class StringMethods {
    public static void main(String[] args) {

        String str = " java 11 ";
        System.out.println(str.isBlank());
        System.out.println(str.strip());
        System.out.println(str.repeat(3));

        var list = List.of("java", "Spring", "Microservices");
        list.forEach(System.out::println);

    }
}
