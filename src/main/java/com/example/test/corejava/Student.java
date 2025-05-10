package com.example.test.corejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }

    public String toString() {
        return id+" "+name+" "+age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(101, "Ramesh", 36),
                new Student(102, "Ravi", 40),
                new Student(103, "Vinod", 25));
        Collections.sort(list);
        System.out.println(list);
    }


}
