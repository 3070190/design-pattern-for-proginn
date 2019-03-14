package com.wangwei.design.pattern.strategy.strategys;

import com.wangwei.design.pattern.strategy.Strategy;

/**
 * 具体策略 完美策略
 */
public class PerfectStrategy implements Strategy {
    @Override
    public void done() {
        System.out.println("do something perfect");
    }
}
