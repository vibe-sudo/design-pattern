package com.vibe.design.pattern.adapter;

/**
 * @description: 适配器模式测试类
 * @author: vibe
 * @create: 2021-10-16 19:57
 **/
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new USB());
        adapter.typeCCharge();
    }
}
