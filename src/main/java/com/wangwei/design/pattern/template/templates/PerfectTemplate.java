package com.wangwei.design.pattern.template.templates;

import com.wangwei.design.pattern.template.Template;
/**
 * 模板实现类
 */
public class PerfectTemplate extends Template {
    @Override
    public void stepOne() {
        System.out.println("perfect step one");
    }

    @Override
    public void stepTwo() {
        System.out.println("perfect step two");

    }

    @Override
    public void stepThree() {
        System.out.println("perfect step three");

    }
}
