package com.weixiao.designpattern;

import com.weixiao.designpattern.observer.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
    }

    @Test
    public void saveOrderTest(){
        orderService.saveOrder("12232");
    }

}
