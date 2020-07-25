package com.weixiao.designpattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :weixiao
 * @description :通过运用策略模式实现根据用户类型不同，商品折扣不同
 * @date :2020/7/25 21:47
 */
@Service
public class SaleService {

    @Autowired
    NormalService normalService;
    @Autowired
    VipService vipService;

    /**
     *根据用户类型不同，商品折扣不同
     * @param type 用户类型
     * @param salePrice 商品价格
     * @return
     */
    /*public double sale(String type,double salePrice){
        if("normal".equals(type)){
           // return salePrice *0.8;
            return normalService.discount(salePrice);
        }else if("vip".equals(type)){
            //return salePrice *0.5;
            return vipService.discount(salePrice);
        }
        return salePrice;
    }*/

    Map<String,DiscountStrategy> map = new HashMap<>();

    /**
     * 通过构造器注入  List<DiscountStrategy>是实现这个DiscountStrategy这个接口的类数据
     * @param strategyList
     */
    public SaleService(List<DiscountStrategy> strategyList) {
        for(DiscountStrategy strategy :strategyList){
            map.put(strategy.getUserType(),strategy);
        }
    }

    public double sale(String type,double salePrice){
        DiscountStrategy strategy = map.get(type);
        double fee = strategy.discount(salePrice);
        return fee;

    }
}
