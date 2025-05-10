package com.example.test.java8.userdefined.intermediate;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestEmployeeName {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 12000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        Employee emp = list.stream().max(Comparator.comparingInt(e -> e.getName().length())).get();
        System.out.println(emp);
    }
}
