package com.vibe.design.pattern.singleton;

/**
 * @description: 单例模式预加载
 * @author: vibe
 * @create: 2021-09-27 12:04
 **/
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
