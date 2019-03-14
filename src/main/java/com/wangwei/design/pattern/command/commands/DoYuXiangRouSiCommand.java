package com.wangwei.design.pattern.command.commands;

import com.wangwei.design.pattern.command.Chef;
import com.wangwei.design.pattern.command.DoDishesCommand;

public class DoYuXiangRouSiCommand implements DoDishesCommand {

    private Chef chef;
    public DoYuXiangRouSiCommand(Chef chef){
        this.chef=chef;
    }

    @Override
    public void execute() {
        chef.doYuXiangRouSi();
    }
}
