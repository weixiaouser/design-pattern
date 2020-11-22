package com.weixiao.designpattern.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * @author :weixiao
 * @description :通过观察者模式实现订单创建，及发送短信，微信服务，spring的监听机制实现
 * Spring监听机制和MQ消息队列之间的区别：
 * Spring监听机制是单体应用中使用的
 * MQ是分布式应用中使用
 * 如果没设置其他方式发送消息是同步进行的，如果进行异步处理则会进行异步消息发送
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
        //发布消息
        applicationContext.publishEvent(orderEvent);

    }
}
