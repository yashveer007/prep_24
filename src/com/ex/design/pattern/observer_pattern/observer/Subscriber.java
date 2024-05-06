package com.ex.design.pattern.observer_pattern.observer;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println(this.name + " has been Notified!!");
    }
}
