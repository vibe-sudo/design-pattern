package com.vibe.design.pattern.iterator;

import java.util.List;

/**
 * @description: 具体迭代器
 * @author: vibe
 * @create: 2021-10-09 11:35
 **/
public class ConcreteIterator implements Iterator{

    private List<Object> list;

    private int idx;

    public ConcreteIterator(List<Object> list){
        this.list = list;
        this.idx = 0;
    }

    public boolean hasNext() {
        return idx != list.size();
    }

    public Object next() {
        return this.list.get(idx++);
    }

}
