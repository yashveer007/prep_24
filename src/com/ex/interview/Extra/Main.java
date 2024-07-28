package com.ex.interview.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("yashveer",24,60000,"Amroha", Arrays.asList("9898798798","3779827398")));
        employeeList.add(new Employee("little",21,342543,"Noida", Arrays.asList("8787646","7876887687")));
        employeeList.add(new Employee("vijay",23,423442,"Gurgaon", Arrays.asList("65466464","97887")));
        employeeList.add(new Employee("abc",24,54646,"Delhi", Arrays.asList("9898798798")));

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getName,Comparator.reverseOrder()))
                .forEach(System.out::println);

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAddress,Comparator.reverseOrder()))
                .forEach(System.out::println);
        Arrays.asList(12,45,67,11,10,56).stream()
                .sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
    }
}
