package com.wangwei.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 非叶子节点
 */
public class Root extends Compont {

    public Root(String name ,String desc){
        this.name=name;
        this.desc=desc;
    }

    List<Compont> compontList =new ArrayList<>();

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
        for(Compont compont :compontList){
            compont.print();
        }
    }


    /**
     * 添加子项
     */
    public void add(Compont compont){
        compontList.add(compont);
    }

    /**
     * 移除子项
     */
    public void remove(Compont compont){
        compontList.remove(compont);
    }

    /**
     * 获得子项
     * @param i
     * @return
     */
    Compont getChild(int i){
        return compontList.get(i);
    }


}
