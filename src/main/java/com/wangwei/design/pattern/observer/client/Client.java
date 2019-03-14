package com.wangwei.design.pattern.observer.client;

import com.wangwei.design.pattern.observer.ConcreteSubject;
import com.wangwei.design.pattern.observer.Subject;
import com.wangwei.design.pattern.observer.observers.ConcreteObserverA;
import com.wangwei.design.pattern.observer.observers.ConcreteObserverB;

public class Client {
    public static void main (String[] args){
        Subject subject =new ConcreteSubject();
        ConcreteObserverA concreteObserverA =new ConcreteObserverA();
        ConcreteObserverB concreteObserverB =new ConcreteObserverB();
        subject.register(concreteObserverA);
        subject.register(concreteObserverB);
        subject.notifyObsever();

        subject.remove(concreteObserverA);
        subject.notifyObsever();
    }
}
