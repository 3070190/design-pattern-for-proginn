package com.wangwei.design.pattern.command;

/**
 * 厨师，具体的命令执行者
 */
public class Chef {

    public void doGongBaoJiDing(){
        System.out.println("做宫保鸡丁");
    }

    public void doYuXiangRouSi(){
        System.out.println("做鱼香肉丝");
    }

    public void doTangCuLiJi(){
        System.out.println("做糖醋里脊");
    }

}
