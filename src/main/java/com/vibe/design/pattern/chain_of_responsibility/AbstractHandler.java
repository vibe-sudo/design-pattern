package com.vibe.design.pattern.chain_of_responsibility;

/**
 * @description: 处理请求抽象类
 * @author: vibe
 * @create: 2021-10-08 16:44
 **/
public abstract class AbstractHandler {

    public static double BROTHER_LIMIT = 100;

    public static double MOM_LIMIT = 500;

    public static double DAD_LIMIT = 1000;

    protected double limit;

    //责任链上下一元素
    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    protected abstract void handleRequest(double money);

}
