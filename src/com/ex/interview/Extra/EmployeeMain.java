package com.ex.interview.Extra;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("yashveer",24,60000,"Amroha", Arrays.asList("9898798798","3779827398")));
        employeeList.add(new Employee("little",21,342543,"Noida", Arrays.asList("8787646","7876887687")));
        employeeList.add(new Employee("vijay",23,423442,"Gurgaon", Arrays.asList("65466464","97887")));
        employeeList.add(new Employee("abc",24,54646,"Delhi", Arrays.asList("9898798798")));

        double averageSalary = employeeList.stream().mapToInt(e -> e.getSalary()).average().getAsDouble();
        System.out.println("Average salary: " + averageSalary);

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAddress,Comparator.reverseOrder()))
                .forEach(System.out::println);

        List<String> collect = employeeList.stream().flatMap(e -> e.getMobile().stream()).collect(Collectors.toList());
        System.out.println(collect);

        String str = "Yashveer Singh";
        Map<String, Long> collect1 = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        List<String> stringList = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().equalsIgnoreCase(" ") && e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(stringList);

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder()).thenComparing(Employee::getName,Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
