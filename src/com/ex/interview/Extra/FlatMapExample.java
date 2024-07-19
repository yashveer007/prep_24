package com.ex.interview.Extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("yash",12);
        map.put("veer", 40);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("little",23);
        map1.put("yashu", 4);
        List<Map<String, Integer>> list = new ArrayList<>();
        list.add(map1);
        list.add(map);
        list.stream().flatMap(e ->e.entrySet().stream()).filter( e ->e.getValue() > 10).forEach(System.out::println);
    }
}
