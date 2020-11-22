package com.weixiao.designpattern.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author :weixiao
 * @description :通过smartApplicationListener 来实现发送消息的顺序
 * @date :2020/11/22 21:11
 */
@Component
public class TsListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == OrderEvent.class;
    }

    @Override
    public int getOrder() {//越小越优先发送  为了避免影响spring中其他事件监听可以设置大的数值50
        return 50;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        //业务逻辑处理
        System.out.println("推送消息发送");
    }
}
