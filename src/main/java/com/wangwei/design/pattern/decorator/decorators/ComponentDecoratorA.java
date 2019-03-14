package com.wangwei.design.pattern.decorator.decorators;

import com.wangwei.design.pattern.decorator.Component;
import com.wangwei.design.pattern.decorator.Decorator;

/**
 * 具体的装饰着A
 */
public class ComponentDecoratorA  implements Decorator {

   private  Component component;

    public ComponentDecoratorA(Component component){
        this.component =component;
    }

    @Override
    public void operation() {
        System.out.println("ComponentDecoratorA装饰完成");
        component.operation();
    }
}
