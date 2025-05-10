package com.example.test.java8.userdefined.intermediate;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSecondHighestSal {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 12000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        //Optional<Employee> emp = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        //emp.ifPresent(System.out::println);

       Optional<Double> secondHighestSal = list.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighestSal.ifPresent(System.out::println);

       //System.out.println(distinctSal.get(1));
        //double secondHightSal = distinctSal.get(1);

        //list.stream().filter(emp -> emp.getSalary() == secondHightSal).forEach(System.out::println);


    }
}
