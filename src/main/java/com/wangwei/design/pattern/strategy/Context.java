package com.wangwei.design.pattern.strategy;

/**
 * 策略执行上下文
 */
public class Context {
    private Strategy strategy =null;

    public Context(Strategy strategy){
        this.strategy =strategy;
    }

    public void done(){
        strategy.done();
    }
}
