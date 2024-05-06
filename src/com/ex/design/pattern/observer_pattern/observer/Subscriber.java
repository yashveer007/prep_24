package com.ex.design.pattern.observer_pattern.observer;

public class Subscriber implements Observer{

    @Override
    public void notified() {
        System.out.println("Notified!!");
    }
}
