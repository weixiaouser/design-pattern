package com.weixiao.designpattern.strategy;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/25 21:58
 */
public interface DiscountStrategy {

    /**
     * 获取用户类型
     * @return
     */
    public String getUserType();

    /**
     * 计算商品折扣
     * @param salePrice 商品售价
     * @return
     */
    public double discount(double salePrice);
}
