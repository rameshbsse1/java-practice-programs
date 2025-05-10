package com.example.test.java8.userdefined.advanced;

import com.example.test.java8.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesInSameCityByDet {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ramesh", 14000, 1, "Hyd", "IT"),
                new Employee("Rajesh", 12000, 1, "Jammu", "Accounts"),
                new Employee("Ravi", 10000, 1, "Hyd", "Testing"),
                new Employee("Karthik", 8500, 1, "Bng", "Accounts"),
                new Employee("Vikram", 11000, 1, "Pune", "Testing"),
                new Employee("Harish", 12000, 1, "Hyd", "IT"),
                new Employee("John", 14000, 1, "Bng", "IT"));

        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDeptName));

        map.forEach((dept, empList)-> {
            System.out.println("Dept :"+dept);
            empList.stream().collect(Collectors.groupingBy(Employee::getLocation))
                    .forEach((loc, emps) -> {
                        System.out.println("Employees in city :" +loc);
                        emps.forEach(empl -> System.out.println(empl.getName()));
                    });
        });
    }
}
