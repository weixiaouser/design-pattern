package com.weixiao.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/25 22:19
 */
@Service
public class VipService implements DiscountStrategy {
    @Override
    public String getUserType() {
        return "vip";
    }

    @Override
    public double discount(double salePrice) {
        return salePrice * 0.5;
    }
}
