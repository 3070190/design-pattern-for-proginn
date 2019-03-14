package com.wangwei.design.pattern.composite;

/**
 *  总的抽象类
 */
public abstract class Compont {

    /**
     * 添加子项
     */
    public  void add(Compont compont){
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子项
     */
    public void remove(Compont compont){
        throw new UnsupportedOperationException();
    }

    /**
     * 获得子项
     * @param i
     * @return
     */
    Compont getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDesc(){
        throw new UnsupportedOperationException();
    }


    public void print(){
        throw new UnsupportedOperationException();
    }
}
