package com.wangwei.design.pattern.Iterator;

import java.util.List;

public class NameListIterator implements  Iterator{

    private List<Name> nameList ;

    public NameListIterator(List<Name> nameList){
        this.nameList = nameList;
    }

    private int position = 0;

    @Override
    public boolean hasNext() {
        if(position>=nameList.size()||nameList.get(position)==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        return nameList.get(position++);
    }
}
