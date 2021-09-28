package com.vibe.design.pattern.proxy;

/**
 * @description: 真实角色
 * @author: vibe
 * @create: 2021-09-28 11:00
 **/
public class RealMovie  implements Movie{

    public void play() {
        System.out.println("观看电影ing");
    }

}
