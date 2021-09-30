package com.vibe.design.pattern.prototype;

/**
 * @description: 抽象原型基类
 * @author: vibe
 * @create: 2021-09-30 15:50
 **/
public class Base implements Cloneable{

    //clone浅拷贝无法深拷贝
    //private ArrayList list = new ArrayList();

    public Base clone(){
        Base obj = null;
        try {
            obj = (Base)super.clone();

            //自行深拷贝
            //obj.list = (ArrayList) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
