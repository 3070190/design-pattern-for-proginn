package com.wangwei.design.pattern.state.states;

import com.wangwei.design.pattern.state.Context;
import com.wangwei.design.pattern.state.State;

public class StoppingState implements State {

    private Context context;
    public StoppingState(Context context){
        this.context =context;
    }

    @Override
    public void open() {
        System.out.println("open");
        context.setCurrentState(context.getOpeningState());
    }

    @Override
    public void close() {
        System.out.println("close");
        context.setCurrentState(context.getClosingState());
    }

    @Override
    public void run() {
        System.out.println("run");
        context.setCurrentState(context.getRunningState());
    }

    @Override
    public void stop() {
        //do nothing
    }
}
