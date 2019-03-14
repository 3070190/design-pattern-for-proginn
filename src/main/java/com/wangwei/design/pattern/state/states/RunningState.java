package com.wangwei.design.pattern.state.states;

import com.wangwei.design.pattern.state.Context;
import com.wangwei.design.pattern.state.State;

public class RunningState implements State {

    private Context context;
    public RunningState(Context context){
        this.context =context;
    }

    @Override
    public void open() {
        //do nothing
    }

    @Override
    public void close() {

        //do nothing
    }

    @Override
    public void run() {

        //do nothing
    }

    @Override
    public void stop() {
        System.out.println("stop");
        context.setCurrentState(context.getCurrentState());
    }
}
