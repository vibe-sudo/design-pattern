package com.vibe.design.pattern.observer;

/**
 * @description: 测试实际场景
 * @author: vibe
 * @create: 2021-09-27 15:38
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
