package com.vibe.design.pattern.proxy.dynamic.jdk;

import com.vibe.design.pattern.proxy.Movie;
import com.vibe.design.pattern.proxy.RealMovie;

/**
 * @description: JDK动态代理测试类
 * @author: vibe
 * @create: 2021-09-28 11:26
 **/
public class Test {
    public static void main(String[] args) {
        Handler<Movie> handler = new Handler<Movie>(new RealMovie());
        Movie proxy = handler.getInstance();
        proxy.play();

    }
}
