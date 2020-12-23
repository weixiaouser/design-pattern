package com.weixiao.designpattern.factory.simpleFactory.pizzastore;

/**
 * @author :weixiao
 * @description :
 * @date :2020/12/23 11:18
 */
public class SeafoodPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给海鲜披萨准备   海鲜");
    }


}
