package com.wangwei.design.pattern.proxy;

/**
 * 实现相同接口的代理类
 *
 */
public class Proxy implements DoSomeThingInterface {

    private DoSomeThingInterface doSomeThing=new DoSomeThing();

    @Override
    public void done() {
        before();
        doSomeThing.done();
        after();
    }

    private void after() {
        System.out.println("之后做了些事");
    }

    private void before() {
        System.out.println("之前做了些事");
    }
}
