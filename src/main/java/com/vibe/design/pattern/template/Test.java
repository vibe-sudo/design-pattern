package com.vibe.design.pattern.template;

/**
 * @description: 模板方法模式测试类
 * @author: vibe
 * @create: 2021-10-14 15:25
 **/
public class Test {
    public static void main(String[] args) {

        BaseGame game = new CSGO();
        game.play();

        System.out.println();

        game = new PUBG();
        game.play();

    }
}
