package com.weixiao.designpattern.factory.simpleFactory.pizzastore;

/**
 * @author :weixiao
 * @description :
 * @date :2020/12/23 11:20
 */
public class CheesePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备 奶酪");
    }
}
