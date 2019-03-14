package com.wangwei.design.pattern.state.states;

import com.wangwei.design.pattern.state.Context;
import com.wangwei.design.pattern.state.State;

public class OpeningState  implements State {
    private Context context;
    public OpeningState(Context context){
        this.context =context;
    }

    @Override
    public void open() {

        //do nothing
    }

    @Override
    public void close() {
        System.out.println("close");
        context.setCurrentState(context.getClosingState());
    }

    @Override
    public void run() {

        //do nothing;
    }

    @Override
    public void stop() {

        //do nothing;
    }
}
