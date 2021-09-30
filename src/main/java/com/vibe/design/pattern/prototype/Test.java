package com.vibe.design.pattern.prototype;

/**
 * @description: 原型模式测试类(Client)
 * @author: vibe
 * @create: 2021-09-30 16:01
 **/
public class Test {
    public static void main(String[] args){
        Target target = new Target();
        System.out.println(target);
        for(int i  = 1;i<=10;i++){
            Target cloneTarget = (Target)target.clone();
            System.out.print(cloneTarget);
            cloneTarget.show();
        }
    }
}
