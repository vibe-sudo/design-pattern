package com.vibe.design.pattern.observer;

/**
 * @description: 测试观察者实体类02
 * @author: vibe
 * @create: 2021-09-27 15:31
 **/
public class OctalObserver extends BaseObserver {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
