package com.example.test.java8.userdefined.advanced;

import com.example.test.java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalAvgByDept {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 12000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.averagingDouble(Employee::getSalary)));
        Optional<Map.Entry<String, Double>> result = map.entrySet().stream().max(Map.Entry.comparingByValue());
        result.ifPresent(entry -> System.out.println("Dept with highest sal avg : "+entry.getKey()+" ->"+entry.getValue()));
    }
}
