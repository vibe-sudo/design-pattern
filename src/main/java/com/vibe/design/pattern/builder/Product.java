package com.vibe.design.pattern.builder;

/**
 * @description: 产品类
 * @author: vibe
 * @create: 2021-09-30 16:58
 **/
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public Product(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

}
