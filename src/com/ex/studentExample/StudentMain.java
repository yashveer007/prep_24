package com.ex.studentExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("yashveer", 26, 1, "12"));
        studentList.add(new Student("yash", 26, 19, "9"));
        studentList.add(new Student("little", 24, 61, "6"));
        studentList.add(new Student("abc", 21, 12, "11"));
        studentList.add(new Student("fgg", 15, 14, "10"));
        studentList.stream()
                .sorted(Comparator.comparing(Student::getAge, Collections.reverseOrder())).skip(3)
                .forEach(System.out::println);

        studentList.stream()
                .sorted((e1,e2) -> e2.getAge() - e1.getAge()).forEach(System.out::println);
    }
}
