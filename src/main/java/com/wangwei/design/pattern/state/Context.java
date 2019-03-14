package com.wangwei.design.pattern.state;


import com.wangwei.design.pattern.state.states.ClosingState;
import com.wangwei.design.pattern.state.states.OpeningState;
import com.wangwei.design.pattern.state.states.RunningState;
import com.wangwei.design.pattern.state.states.StoppingState;

/**
 * 状态上下文
 */
public class Context {
    private State openingState =new OpeningState(this);
    private State closingState =new ClosingState(this);
    private State runningState =new RunningState(this);
    private State stoppingState =new StoppingState(this);

    private State currentState=stoppingState;


    public void open(){
        currentState.open();
    }

    public void close(){
        currentState.close();
    }

    public void run(){
        currentState.run();
    }

    public void stop(){
        currentState.stop();
    }


    public State getOpeningState() {
        return openingState;
    }

    public void setOpeningState(State openingState) {
        this.openingState = openingState;
    }

    public State getClosingState() {
        return closingState;
    }

    public void setClosingState(State closingState) {
        this.closingState = closingState;
    }

    public State getRunningState() {
        return runningState;
    }

    public void setRunningState(State runningState) {
        this.runningState = runningState;
    }

    public State getStoppingState() {
        return stoppingState;
    }

    public void setStoppingState(State stoppingState) {
        this.stoppingState = stoppingState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
