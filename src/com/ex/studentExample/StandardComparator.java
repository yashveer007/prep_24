package com.ex.studentExample;

import java.util.Comparator;

public class StandardComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStandard().compareTo(o2.getStandard());
    }
}
