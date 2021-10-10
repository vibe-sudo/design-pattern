package com.vibe.design.pattern.observer;

/**
 * @description: 测试观察者实体类03
 * @author: vibe
 * @create: 2021-09-27 15:32
 **/
public class HexaObserver extends BaseObserver {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}