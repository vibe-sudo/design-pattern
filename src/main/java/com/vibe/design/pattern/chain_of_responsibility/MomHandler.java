package com.vibe.design.pattern.chain_of_responsibility;

/**
 * @description: 妈妈处理类
 * @author: vibe
 * @create: 2021-10-08 16:53
 **/
public class MomHandler extends AbstractHandler{

    public MomHandler(double limit){
        this.limit = limit;
    }

    @Override
    protected void handleRequest(double money) {
        if(money<=this.limit){
            System.out.println("妈妈给了小明 " + money + " 元");
        }else{//处理不了交给下一个处理节点处理
            if(null != this.nextHandler){
                this.nextHandler.handleRequest(money);
            }else{//无法处理
                System.out.println("钱太多啦给不了啦！！！");
            }
        }
    }

}
