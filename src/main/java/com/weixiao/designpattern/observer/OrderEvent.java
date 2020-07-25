package com.weixiao.designpattern.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @author :weixiao
 * @description :通过观察者模式实现订单监听
 * @date :2020/7/25 19:45
 */
public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Object source) {
        super(source);
    }
}
