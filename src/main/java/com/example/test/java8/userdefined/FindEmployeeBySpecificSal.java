package com.example.test.java8.userdefined;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.List;

public class FindEmployeeBySpecificSal {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 140000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 120000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 100000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 85000, 1, "Bng", "Accounts"),
                new Employee("Vikram", 110000, 1, "Pune", "Testing"),
                new Employee("Harish", 100000, 1, "Hyd", "IT"),
                new Employee("John", 140000, 1, "Bng", "IT"));

        list.stream().filter(emp -> emp.getSalary() > 100000).map(Employee::getName).forEach(System.out::println);
    }
}
