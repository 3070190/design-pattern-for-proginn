package com.wangwei.design.pattern.facade;

/**
 * 统一对外的接口
 */
public class Facade {

    private SomethingDoerA somethingDoerA =new SomethingDoerA();
    private SomethingDoerB somethingDoerB =new SomethingDoerB();
    private SomethingDoerC somethingDoerC =new SomethingDoerC();

    /**
     * 外观接口帮助客户端整合内部系统的各个组件
     */
    public void done(){
        somethingDoerA.done();
        somethingDoerB.done();
        somethingDoerC.done();

    }
}
