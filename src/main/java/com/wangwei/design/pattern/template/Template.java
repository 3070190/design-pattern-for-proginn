package com.wangwei.design.pattern.template;

/**
 * 模板方法类
 */
public abstract class Template {

    public abstract void stepOne();

    public abstract void stepTwo();

    public abstract void stepThree();

    public void done(){
        stepOne();

        stepTwo();

        stepThree();
    }
}
