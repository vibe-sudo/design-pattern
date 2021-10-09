package com.vibe.design.pattern.iterator;

import java.util.List;

/**
 * @description: 具体容器
 * @author: vibe
 * @create: 2021-10-09 11:23
 **/
public class ConcreteAggregate implements Aggregate{

    private List<Object> list;

    public ConcreteAggregate(List<Object> list){
        this.list = list;
    }

    public void add(Object obj) {
        list.add(obj);
    }

    public Iterator iterator() {
        return new ConcreteIterator(this.list);
    }

}
