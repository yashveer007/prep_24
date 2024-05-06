package com.ex.design.pattern.observer_pattern.main;

import com.ex.design.pattern.observer_pattern.observable.YoutubeChannel;
import com.ex.design.pattern.observer_pattern.observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber = new Subscriber();
        channel.suscribe(subscriber);
        channel.notifyChanges();
    }
}
