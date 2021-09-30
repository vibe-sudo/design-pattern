package com.vibe.design.pattern.builder;

/**
 * @description: 建造者模式测试类
 * @author: vibe
 * @create: 2021-09-30 17:05
 **/
public class Test {
    public static void main(String[] args) {

        System.out.println("Lower:");
        Builder builder = new LowerBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getProduct());

        System.out.println("Upper:");
        builder = new UpperBuilder();
        director = new Director(builder);
        director.construct();
        System.out.println(builder.getProduct());

    }
}
