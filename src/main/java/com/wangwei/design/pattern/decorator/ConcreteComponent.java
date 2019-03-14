package com.wangwei.design.pattern.decorator;

/**
 * 具体的被装饰组件
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("ConcreteComponent执行");
    }
}
