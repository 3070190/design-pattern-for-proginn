package com.wangwei.design.pattern.composite;

/**
 * 叶子节点，没有子节点
 */
public class Leaf extends Compont{

    public Leaf(String name ,String desc){
        this.name=name;
        this.desc=desc;
    }


    private String name;
    private String desc;

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }

    public void print(){
        System.out.println("name:"+getName()+" desc:"+getDesc());
    }



}
