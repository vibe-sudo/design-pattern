package com.vibe.design.pattern.template;

/**
 * @description: 扩展游戏实体类（CSGO）
 * @author: vibe
 * @create: 2021-10-14 15:23
 **/
public class CSGO extends BaseGame{

    @Override
    void init() {
        System.out.println("CSGO游戏初始化ing");
    }

    @Override
    void start() {
        System.out.println("CSGO游戏启动");
    }

    @Override
    void end() {
        System.out.println("CSGO游戏结束");
    }

}
