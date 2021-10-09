package com.vibe.design.pattern.iterator;

import java.util.ArrayList;

/**
 * @description: 迭代器模式测试类
 * @author: vibe
 * @create: 2021-10-09 11:03
 **/
public class Test {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate(new ArrayList<Object>());
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");
        Iterator it = aggregate.iterator();
        while(it.hasNext()){
            String str = (String)(it.next());
            System.out.println(str);
        }
    }
}
