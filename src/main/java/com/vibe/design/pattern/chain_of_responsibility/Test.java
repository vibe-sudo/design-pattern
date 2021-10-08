package com.vibe.design.pattern.chain_of_responsibility;

/**
 * @description: 责任链模式测试类
 * @author: vibe
 * @create: 2021-10-08 17:01
 **/
public class Test {
    public static void main(String[] args) {

        //小明想要的钱
        double moneyRequest1 = 100;
        double moneyRequest2 = 152;
        double moneyRequest3 = 500;
        double moneyRequest4 = 525;
        double moneyRequest5 = 1000;
        double moneyRequest6 = 1000.5;

        AbstractHandler brotherHandler = new BrotherHandler(AbstractHandler.BROTHER_LIMIT);
        AbstractHandler momHandler = new MomHandler(AbstractHandler.MOM_LIMIT);
        AbstractHandler dadHandler = new DadHandler(AbstractHandler.DAD_LIMIT);
        brotherHandler.setNextHandler(momHandler);
        momHandler.setNextHandler(dadHandler);

        //从链头开始尝试处理
        brotherHandler.handleRequest(moneyRequest1);
        brotherHandler.handleRequest(moneyRequest2);
        brotherHandler.handleRequest(moneyRequest3);
        brotherHandler.handleRequest(moneyRequest4);
        brotherHandler.handleRequest(moneyRequest5);
        brotherHandler.handleRequest(moneyRequest6);

    }
}
