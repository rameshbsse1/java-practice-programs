package com.example.test.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NameComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(101, "John", 36),
                new Student(102, "Bob", 40),
                new Student(103, "Charlie", 25));
        list.sort(new NameComparator());
        System.out.println(list);
    }
}
