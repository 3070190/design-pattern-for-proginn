package com.wangwei.design.pattern.proxy.client;

import com.wangwei.design.pattern.proxy.DoSomeThingInterface;
import com.wangwei.design.pattern.proxy.Proxy;

public class Client {
    public static void main(String[] args){
        DoSomeThingInterface doSomeThing =new Proxy();
        doSomeThing.done();
    }
}
