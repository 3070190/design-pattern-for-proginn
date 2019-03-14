package com.wangwei.design.pattern.Iterator.client;

import com.wangwei.design.pattern.Iterator.Name;
import com.wangwei.design.pattern.Iterator.NameList;
import com.wangwei.design.pattern.Iterator.NameListIterator;

public class Client {
    public static void main(String[] args){
        NameList nameList =new NameList();

        Name liuxiang =new Name();
        liuxiang.setFristName("liu");
        liuxiang.setLastName("xiang");
        nameList.addName(liuxiang);

        Name yaoming =new Name();
        yaoming.setFristName("yao");
        yaoming.setLastName("ming");
        nameList.addName(yaoming);


        Name zhaoyun =new Name();
        zhaoyun.setFristName("zhao");
        zhaoyun.setLastName("yun");
        nameList.addName(zhaoyun);


        NameListIterator iterator = nameList.createIterator();
        while (iterator.hasNext()){
            Name name =(Name)iterator.next();
            System.out.println("first name "+name.getFristName()+" last name "+ name.getLastName());
        }




    }
}
