package com.vibe.design.pattern.builder;

/**
 * @description: 建造者接口
 * @author: vibe
 * @create: 2021-09-30 16:58
 **/
public interface Builder {

    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getProduct();

}


