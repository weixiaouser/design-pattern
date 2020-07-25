package com.weixiao.designpattern;

import com.weixiao.designpattern.observer.OrderService;
import com.weixiao.designpattern.strategy.SaleService;
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

    @Autowired
    SaleService saleService;

    @Test
    public void saleTest(){
        System.out.println( saleService.sale("vip",100));
        System.out.println( saleService.sale("normal",100));
    }

}
