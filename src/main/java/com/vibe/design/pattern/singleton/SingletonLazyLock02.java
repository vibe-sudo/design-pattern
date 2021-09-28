package com.vibe.design.pattern.singleton;

/**
 * @description: 懒加载加静态方法同步锁
 * @author: vibe
 * @create: 2021-09-27 15:05
 **/
public class SingletonLazyLock02 {

    private static SingletonLazyLock02 instance;

    private SingletonLazyLock02(){}

    public static SingletonLazyLock02 getInstance(){
        if(instance == null){
            synchronized (SingletonLazyLock02.class){
                instance = new SingletonLazyLock02();
            }
        }
        return null;
    }

}
