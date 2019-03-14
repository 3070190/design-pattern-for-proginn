package com.wangwei.design.pattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题实现
 */
public class ConcreteSubject implements  Subject{

    List<Observer> observerList =new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
//        for(Observer item :observerList){
//            if(item==observer){
//                observerList.remove(item);
//            }
//        }
        observerList.remove(observer);
    }

    @Override
    public void notifyObsever() {
        for(Observer item :observerList){
            item.update();
        }
    }
}
