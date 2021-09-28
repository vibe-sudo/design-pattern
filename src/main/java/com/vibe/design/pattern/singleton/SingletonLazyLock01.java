package com.vibe.design.pattern.singleton;

/**
 * @description: 懒加载加静态方法同步锁
 * @author: vibe
 * @create: 2021-09-27 15:05
 **/
public class SingletonLazyLock01 {

    private static SingletonLazyLock01 instance;

    private SingletonLazyLock01(){}

    public static synchronized SingletonLazyLock01 getInstance(){
        if(instance == null){
            instance = new SingletonLazyLock01();
        }
        return instance;
    }

}
