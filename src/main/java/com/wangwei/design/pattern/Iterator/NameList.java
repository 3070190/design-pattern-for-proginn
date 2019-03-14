package com.wangwei.design.pattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称列表对象
 */
public class NameList {
    private List<Name> nameList =new ArrayList<>();

    public void addName(Name name){
        nameList.add(name);
    }

    public NameListIterator createIterator(){
        return new NameListIterator(nameList);
    }
}
