package com.vibe.design.pattern.iterator;

/**
 * @description: 抽象容器
 * @author: vibe
 * @create: 2021-10-09 11:02
 **/
public interface Aggregate {

    void add(Object obj);

    Iterator iterator();

}
