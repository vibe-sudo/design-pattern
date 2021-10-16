package com.vibe.design.pattern.template;

/**
 * @description: 扩展游戏实体类（绝地求生）
 * @author: vibe
 * @create: 2021-10-14 15:24
 **/
public class PUBG extends BaseGame{

    @Override
    void init() {
        System.out.println("PUBG游戏初始化ing");
    }

    @Override
    void start() {
        System.out.println("PUBG游戏启动");
    }

    @Override
    void end() {
        System.out.println("PUBG游戏结束");
    }

}
