package com.vibe.design.pattern.singleton;

/**
 * @description: 单例模式懒加载
 * @author: vibe
 * @create: 2021-09-27 12:06
 **/
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
