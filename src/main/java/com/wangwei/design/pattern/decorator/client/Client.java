package com.wangwei.design.pattern.decorator.client;

import com.wangwei.design.pattern.decorator.Component;
import com.wangwei.design.pattern.decorator.ConcreteComponent;
import com.wangwei.design.pattern.decorator.decorators.ComponentDecoratorA;
import com.wangwei.design.pattern.decorator.decorators.ComponentDecoratorB;

public class Client {
    public static void main(String[] args){
        Component component =new ConcreteComponent();
        Component decoratorA =new ComponentDecoratorA(component);
        Component decoratorB =new ComponentDecoratorB(decoratorA);
        decoratorB.operation();

    }
}
