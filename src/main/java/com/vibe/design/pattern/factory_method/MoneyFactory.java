package com.vibe.design.pattern.factory_method;

/**
 * @description: 造钱工厂
 * @author: vibe
 * @create: 2021-10-17 17:19
 **/
public class MoneyFactory {

    public Money getMoney(Integer value){
        if(MoneyConsts.ONE.equals(value)){
            return new One();
        }
        else if (MoneyConsts.FIVE.equals(value)){
            return new Five();
        }
        else if(MoneyConsts.TEN.equals(value)){
            return new Ten();
        }
        return null;
    }

}
