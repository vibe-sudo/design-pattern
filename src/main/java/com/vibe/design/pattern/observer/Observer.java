package com.vibe.design.pattern.observer;

/**
 * @description: 观察者抽象类
 * @author: vibe
 * @create: 2021-09-27 15:23
 **/
public abstract class Observer {


    protected Subject subject;

    /**
     * @description: 主题更新状态观察者跟随更新状态
     * @return: void
     * @author: vibe
     * @time: 2021/9/27 15:25
     */
    public abstract void update();

}
