package com.vibe.design.pattern.builder;

/**
 * @description: 建造者实例（大写）
 * @author: vibe
 * @create: 2021-09-30 17:01
 **/
public class UpperBuilder implements Builder{

    private String partA;

    private String partB;

    private String partC;

    public void buildPartA() {
        this.partA = new String("A");
    }

    public void buildPartB() {
        this.partB = new String("B");
    }

    public void buildPartC() {
        this.partC = new String("C");
    }

    public Product getProduct() {
        return new Product(partA,partB,partC);
    }

}
