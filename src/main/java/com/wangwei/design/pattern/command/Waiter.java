package com.wangwei.design.pattern.command;


import java.util.LinkedList;
import java.util.List;

/**
 * 服务员
 */
public class Waiter {

    List<DoDishesCommand> doDishCommands =null;

    public void addDishes(List<DoDishesCommand> doDishCommands){
        this.doDishCommands =doDishCommands;
    }

    public void orderUp(){
        for(DoDishesCommand command:doDishCommands){
            command.execute();
        }
    }
}
