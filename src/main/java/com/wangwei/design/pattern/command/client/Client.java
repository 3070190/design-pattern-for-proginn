package com.wangwei.design.pattern.command.client;

import com.wangwei.design.pattern.command.Chef;
import com.wangwei.design.pattern.command.DoDishesCommand;
import com.wangwei.design.pattern.command.Waiter;
import com.wangwei.design.pattern.command.commands.DoGongBaoJiDingCommand;
import com.wangwei.design.pattern.command.commands.DoTangCuLiJiCommand;
import com.wangwei.design.pattern.command.commands.DoYuXiangRouSiCommand;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String [] args){
        Chef chef =new Chef();
        Waiter waiter =new Waiter();
        List<DoDishesCommand> doDishesCommandList =new LinkedList<>();
        doDishesCommandList.add(new DoGongBaoJiDingCommand(chef));
        doDishesCommandList.add(new DoYuXiangRouSiCommand(chef));
        doDishesCommandList.add(new DoTangCuLiJiCommand(chef));

        waiter.addDishes(doDishesCommandList);
        waiter.orderUp();

    }
}
