package com.example.test.java8.userdefined.intermediate;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNamesAndTheirSalaries {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 10000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        Map<String, Double> map = list.stream().collect(Collectors.toMap(e-> e.getName().toUpperCase(), Employee::getSalary));
        map.forEach((k, v) -> System.out.println(k+ " "+v));

        // to find the employees by their salaries in descending order
        List<Employee> sortedEmp = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed())
                .toList();
        System.out.println(sortedEmp);
    }
}
