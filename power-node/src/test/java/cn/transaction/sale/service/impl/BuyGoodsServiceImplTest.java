package cn.transaction.sale.service.impl;

import cn.transaction.sale.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BuyGoodsServiceImplTest {

    @Test
    public void buy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyGoodsService buyService = (BuyGoodsService) context.getBean("buyService");
        buyService.buy(1001,2);
    }
}