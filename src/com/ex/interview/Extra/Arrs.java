package com.ex.interview.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrs extends Thread {
    public static void main(String[] args) {
        Arrs thread = new Arrs();
        thread.start();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
