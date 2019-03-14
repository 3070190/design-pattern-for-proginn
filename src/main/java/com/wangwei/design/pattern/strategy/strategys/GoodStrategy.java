package com.wangwei.design.pattern.strategy.strategys;

import com.wangwei.design.pattern.strategy.Strategy;

/**
 * 具体策略 坏的策略
 */
public class GoodStrategy implements Strategy {
    @Override
    public void done() {
        System.out.println("do something good");
    }
}
