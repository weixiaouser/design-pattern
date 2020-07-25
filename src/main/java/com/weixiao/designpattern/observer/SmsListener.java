package com.weixiao.designpattern.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/25 19:51
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        //实现发送短信的逻辑

        System.out.println("短信发送成功！"+orderEvent.getSource());
    }
}
