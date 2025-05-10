package com.example.test.java8.userdefined;

import com.example.test.java8.Employee;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEmployeeBySpecificDept {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 140000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 120000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 100000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 85000, 1, "Bng", "Accounts"),
                new Employee("Vikram", 110000, 1, "Pune", "Testing"),
                new Employee("Harish", 100000, 1, "Hyd", "IT"),
                new Employee("John", 140000, 1, "Bng", "IT"));

        Employee e1 = list.stream().filter(e -> e.getDeptName().equalsIgnoreCase("Testing1"))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found in dept"));
        System.out.println(e1.toString());
    }
}
