package com.wangwei.design.pattern.state;

/**
 * 电梯状态接口
 */
public interface State {
    void open();
    void close();
    void run();
    void stop();
}
