package com.ex.design.pattern.observer_pattern.observable;

import com.ex.design.pattern.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void suscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsuscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notifyChanges() {
        for(Observer ob: subscribers){
            ob.notified();
        }
    }
}
