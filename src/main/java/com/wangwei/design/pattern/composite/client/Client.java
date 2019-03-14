package com.wangwei.design.pattern.composite.client;

import com.wangwei.design.pattern.composite.Compont;
import com.wangwei.design.pattern.composite.Leaf;
import com.wangwei.design.pattern.composite.Root;

public class Client {
    public static void main(String[] args){
        Compont level0 =new Root("level0","这是level0");
        Compont level1A =new Root("level1A","这是level1A");
        Compont level1B =new Root("level1B","这是level1B");
        Compont level2A =new Leaf("level2A","这是level2A");

        level0.add(level1A);
        level0.add(level1B);
        level1A.add(level2A);

        level0.print();

    }
}
