package com.weixiao.designpattern.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author :weixiao
 * @description : 实现发送微信逻辑 交给Spring 去管理
 * @date :2020/7/25 19:54
 */
@Component
public class WxListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        //实现发送微信的逻辑
        System.out.println("发送微信成功！");
    }
}
