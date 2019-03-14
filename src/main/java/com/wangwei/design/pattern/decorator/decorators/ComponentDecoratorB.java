package com.wangwei.design.pattern.decorator.decorators;

import com.wangwei.design.pattern.decorator.Component;
import com.wangwei.design.pattern.decorator.Decorator;

/**
 * 具体的装饰着B
 */
public class ComponentDecoratorB implements Decorator {
    private Component component;

    public ComponentDecoratorB(Component component){
        this.component =component;
    }

    @Override
    public void operation() {
        System.out.println("ComponentDecoratorB装饰完成");
        component.operation();
    }
}
