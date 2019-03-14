package com.wangwei.design.pattern.template.templates;

import com.wangwei.design.pattern.template.Template;

/**
 * 模板实现类
 */
public class GoodTemplate extends Template {
    @Override
    public void stepOne() {
        System.out.println("good step one");
    }

    @Override
    public void stepTwo() {
        System.out.println("good step two");

    }

    @Override
    public void stepThree() {
        System.out.println("good step three");

    }
}
