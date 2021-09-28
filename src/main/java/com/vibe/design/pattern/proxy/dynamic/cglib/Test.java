package com.vibe.design.pattern.proxy.dynamic.cglib;

import com.vibe.design.pattern.proxy.Movie;
import com.vibe.design.pattern.proxy.RealMovie;

/**
 * @description: cglib动态代理测试类
 * @author: vibe
 * @create: 2021-09-28 11:55
 **/
public class Test {
    public static void main(String[] args) {

        Handler<Movie> handler = new Handler<Movie>(new RealMovie());
        Movie proxy = handler.getInstance();
        proxy.play();

        System.out.println("=============");

        Handler<Target> handler1 = new Handler<Target>(new Target());
        Target proxy1 = handler1.getInstance();
        proxy1.function();

    }
}
