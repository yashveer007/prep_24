package com.ex.design.pattern.observer_pattern.observable;

import com.ex.design.pattern.observer_pattern.observer.Observer;

public interface Subject {
    void suscribe(Observer ob);
    void unsuscribe(Observer ob);
    void notifyChanges();

}
