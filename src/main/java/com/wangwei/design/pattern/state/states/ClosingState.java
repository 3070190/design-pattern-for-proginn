package com.wangwei.design.pattern.state.states;

import com.wangwei.design.pattern.state.Context;
import com.wangwei.design.pattern.state.State;

public class ClosingState implements State {

    private Context context;
    public ClosingState(Context context){
        this.context =context;
    }

    @Override
    public void open() {
        System.out.println("open");
        context.setCurrentState(context.getOpeningState());
    }

    @Override
    public void close() {

        //do nothing
    }

    @Override
    public void run() {
        System.out.println("run");
        context.setCurrentState(context.getRunningState());
    }

    @Override
    public void stop() {
        System.out.println("stop");
        context.setCurrentState(context.getStoppingState());

    }
}
