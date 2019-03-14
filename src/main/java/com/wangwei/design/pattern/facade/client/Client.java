package com.wangwei.design.pattern.facade.client;

import com.wangwei.design.pattern.facade.Facade;

public class Client {
    public static void main(String[] args){
        Facade facade =new Facade();
        facade.done();
    }
}
