package com.weixiao.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/25 22:18
 */
@Service
public class NormalService implements DiscountStrategy {
    @Override
    public String getUserType() {
        return "normal";
    }

    @Override
    public double discount(double salePrice) {
        return salePrice *0.8;
    }
}
