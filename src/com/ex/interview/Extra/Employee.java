package com.ex.interview.Extra;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private String address;
    private List<String> mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    public Employee(String name, int age, int salary, String address, List<String> mobile) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
