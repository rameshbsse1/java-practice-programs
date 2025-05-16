package com.example.test.java8.userdefined.intermediate;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSalEmployee {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 10000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        Employee e1 = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("-----------");
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().ifPresent(System.out::println);
        System.out.println("----------------");
        System.out.println(e1);
        System.out.println();

        double maxSal = list.stream().mapToDouble(Employee::getSalary).max().getAsDouble();

        list.stream().filter(e -> e.getSalary() == maxSal).forEach(System.out::println);
    }
}
