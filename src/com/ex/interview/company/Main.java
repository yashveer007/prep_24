package com.ex.interview.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {

    int id;
    String name;
    String designation;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Emp(int id, String name, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        List<Emp> list = new ArrayList<>();
//        list.add(new Emp(2, "yash","developer",5678));
//        list.add(new Emp(7, "yash","tester",567823));
//        list.add(new Emp(4, "yash","devops",5678));
//        list.add(new Emp(3, "yash","tester",988676));
//        list.add(new Emp(1, "yash","developer",4556));
//
//        List<Emp> collect = list.stream().sorted(Comparator.comparing(Emp::getSalary).thenComparing(Emp::getId)).collect(Collectors.toList());
//        System.out.println(collect);
//
//        Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(Emp::getDesignation, Collectors.counting()));
//        System.out.println(collect1);

        int arr[] = {12, 14, 15,16, 22,42,44,45};

//        int count =0;
//        for(int i =0; i< arr.length-1 ; i++){
//            if(arr[i+1] < arr[i] ){
//                System.out.println(i+1);
//                return;
//            }
//        }

        int start = 0;
        int end = arr.length-1;
       // if(arr[start] )
        while(start <= end){
            int mid = start + (end-start)/2;
            if(start == end){
                System.out.println(start);
                return;
            }
            if(arr[mid] < arr[start]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
    }
}
