package com.vibe.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 主题（被观察者）
 * @author: vibe
 * @create: 2021-09-27 15:20
 **/
public class Subject {

    private List<BaseObserver> observers
            = new ArrayList<BaseObserver>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(BaseObserver observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (BaseObserver observer : observers) {
            observer.update();
        }
    }
}
