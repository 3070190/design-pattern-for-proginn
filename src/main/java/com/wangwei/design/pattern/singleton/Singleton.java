package com.wangwei.design.pattern.singleton;

public class Singleton {



    //第一步私有化构造函数
    private Singleton(){

    }

    private static volatile Singleton singleton;


    //双检查模式
    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton =new Singleton();
                }
            }
        }
        return singleton;
    }



}
