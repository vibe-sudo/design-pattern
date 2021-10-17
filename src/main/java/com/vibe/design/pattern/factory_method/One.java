package com.vibe.design.pattern.factory_method;

/**
 * @description: 1块钱
 * @author: vibe
 * @create: 2021-10-17 17:18
 **/
public class One implements Money{
    public void make() {
        System.out.println("生产了1块钱");
    }
}
