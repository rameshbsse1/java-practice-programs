package com.example.test.java8.userdefined.advanced;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllEmpBelongsToSpecificDept {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 12000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        boolean isMatch = list.stream().allMatch(e ->e.getDeptName().equalsIgnoreCase("Accounts"));
        System.out.println(isMatch);

        boolean anyMatch = list.stream().anyMatch(e ->e.getDeptName().equalsIgnoreCase("Accounts"));
        System.out.println(anyMatch);
    }
}
