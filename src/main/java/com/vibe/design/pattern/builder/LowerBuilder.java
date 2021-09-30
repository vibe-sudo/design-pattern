package com.vibe.design.pattern.builder;

/**
 * @description: 建造者实例（小写）
 * @author: vibe
 * @create: 2021-09-30 17:00
 **/
public class LowerBuilder implements Builder{

    private String partA;

    private String partB;

    private String partC;

    public void buildPartA() {
        this.partA = new String("a");
    }

    public void buildPartB() {
        this.partB = new String("b");
    }

    public void buildPartC() {
        this.partC = new String("c");
    }

    public Product getProduct() {
        return new Product(partA,partB,partC);
    }

}
