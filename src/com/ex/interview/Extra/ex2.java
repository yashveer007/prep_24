package com.ex.interview.Extra;

import java.util.HashMap;

public class ex2 {
    public static void main(String[] args) {

        String arr[][] = {{"DEPOSIT", "123", "300"},
                {"DEPOSIT", "345", "400"},
                {"WITHDRAWL", "345", "100"}};

//            Account id, Amount
//            123 		300
//            345 		400
//            345 		300
//              567 -1
        //int arr[][] = new int[4][4];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i][i]) {
                case ("DEPOSIT"):
                    String key = arr[i + 1][i + 1];
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + Integer.parseInt(arr[i + 2][i + 2]));
                    } else {
                        map.put(key, Integer.parseInt(arr[i + 2][i + 2]));
                    }

                case ("WITHDRAWL"):
                    String key1 = arr[i + 1][i + 1];
                    if (map.containsKey(key1)) {
                        map.put(key1, map.get(key1) - Integer.parseInt(arr[i + 2][i + 2]));
                    } else {
                        map.put(key1, -1);
                    }
            }

        }
    }
}
