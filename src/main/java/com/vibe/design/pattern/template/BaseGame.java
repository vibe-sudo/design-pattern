package com.vibe.design.pattern.template;

/**
 * @description: 抽象游戏类
 * @author: vibe
 * @create: 2021-10-14 15:22
 **/
public abstract class BaseGame {

    abstract void init();

    abstract void start();

    abstract void end();

    public final void play(){

        init();

        start();

        end();

    }

}
