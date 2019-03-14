package com.wangwei.design.pattern.state.client;

import com.wangwei.design.pattern.state.Context;

public class Client {
    public static void main(String[] args){
        Context context =new Context();
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
