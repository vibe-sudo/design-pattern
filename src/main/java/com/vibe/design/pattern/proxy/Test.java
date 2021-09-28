package com.vibe.design.pattern.proxy;

/**
 * @description: 静态代理测试类
 * @author: vibe
 * @create: 2021-09-28 11:14
 **/
public class Test {
    public static void main(String[] args) {
        Movie movie = new RealMovie();
        ProxyMovie proxy = new ProxyMovie(movie);
        proxy.play();
    }
}
