package com.wangwei.design.pattern.observer.observers;

import com.wangwei.design.pattern.observer.Observer;

/**
 * 具体的观察者A
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserverA update");
    }
}
