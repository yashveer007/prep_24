package com.ex.studentExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortUsingJava8 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("yashveer", 26, 1, "12"));
        studentList.add(new Student("yash", 26, 19, "9"));
        studentList.add(new Student("little", 24, 61, "6"));
        studentList.add(new Student("abc", 21, 12, "11"));
        studentList.add(new Student("fgg", 15, 14, "10"));

        studentList.stream()
                .filter(item -> item.getAge() > 21)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

    }
}
