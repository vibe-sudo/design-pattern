package com.vibe.design.pattern.observer;

/**
 * @description: 测试观察者实体类01
 * @author: vibe
 * @create: 2021-09-27 15:27
 **/
public class BinaryObserver extends BaseObserver {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
