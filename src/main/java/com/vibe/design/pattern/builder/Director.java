package com.vibe.design.pattern.builder;

/**
 * @description: 导演类
 * @author: vibe
 * @create: 2021-09-30 17:03
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

}
