package com.ex.studentExample;

public class Student {

    private String name;
    private int age;
    private int roll_no;
    private String standard;

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

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll_no=" + roll_no +
                ", standard='" + standard + '\'' +
                '}';
    }

    public Student(String name, int age, int roll_no, String standard) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.standard = standard;
    }

    public Student() {
    }
}
