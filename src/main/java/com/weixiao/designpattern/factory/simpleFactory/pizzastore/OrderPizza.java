package com.weixiao.designpattern.factory.simpleFactory.pizzastore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author :weixiao
 * @description :
 * @date :2020/12/23 11:47
 */
public class OrderPizza {

    public OrderPizza(){

        Pizza pizza = null;
        String type;
        do{
            type = getType();
            if("cheese".equals(type)){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if("seafood".equals(type)){
                pizza = new SeafoodPizza();
                pizza.setName("海鲜披萨");
            }else{
                break;
            }
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);

    }

    public String getType(){
        System.out.println("请输入披萨类型：");
        BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );

        String tx = null;
        try {
            tx = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tx;
    }
}
