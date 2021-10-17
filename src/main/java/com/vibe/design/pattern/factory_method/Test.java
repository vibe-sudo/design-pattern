package com.vibe.design.pattern.factory_method;

/**
 * @description: 工厂方法模式测试类
 * @author: vibe
 * @create: 2021-10-17 17:21
 **/
public class Test {
    public static void main(String[] args) {
        MoneyFactory factory = new MoneyFactory();
        Money one = factory.getMoney(1);
        one.make();

        Money five = factory.getMoney(5);
        five.make();

        Money ten = factory.getMoney(10);
        ten.make();
    }
}
