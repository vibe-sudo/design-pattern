package com.vibe.design.pattern.proxy;

/**
 * @description: 代理角色
 * @author: vibe
 * @create: 2021-09-28 11:11
 **/
public class ProxyMovie implements Movie{

    private Movie target ;

    public ProxyMovie(Movie target){
        this.target = target;
    }

    public void play() {
        before();
        target.play();
        after();
    }

    public void before(){
        System.out.println("观影前广告");
    }

    public void after(){
        System.out.println("观影后广告");
    }

}
