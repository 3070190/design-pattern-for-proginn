package com.wangwei.design.pattern.observer;

/**
 * 被观察的主题
 */
public interface Subject {
     void register(Observer observer);
     void remove(Observer observer);
     void notifyObsever();
}
