package com.wangwei.design.pattern.strategy.client;


import com.wangwei.design.pattern.strategy.Context;
import com.wangwei.design.pattern.strategy.strategys.PerfectStrategy;

public class Client {

    public static void main(String[] args){
        Context context=new Context(new PerfectStrategy());
        context.done();
    }
}
