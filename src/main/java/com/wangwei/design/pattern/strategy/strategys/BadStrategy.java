package com.wangwei.design.pattern.strategy.strategys;

import com.wangwei.design.pattern.strategy.Strategy;

/***
 * 具体策略 好的策略
 */
public class BadStrategy implements Strategy {
    @Override
    public void done() {
        System.out.println("do something bad");
    }
}
