package com.vibe.design.pattern.singleton;

/**
 * @description: 单例模式懒加载双重检查锁
 * @author: vibe
 * @create: 2021-09-27 11:48
 **/
public class SingletonDCL {

    //volatile 禁止指令重排
    private static volatile SingletonDCL instance;

    private SingletonDCL(){}

    public static SingletonDCL getInstance(){
        if(instance == null){  //首次检查
            synchronized (SingletonDCL.class){
                if(instance == null){   //二次检查
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

}
