package com.weixiao.designpattern.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * @author :weixiao
 * @description :通过策略模式实现订单创建，及发送短信，微信服务，spring的监听机制实现
 * @date :2020/7/25 19:47
 */
@Service
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;

    
    public void saveOrder(String name){
        //创建订单
        //发送短信
        //发送微信

        OrderEvent orderEvent = new OrderEvent(name);
        applicationContext.publishEvent(orderEvent);

    }
}
