package org.witz;

import com.beans.ShopingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans-config.xml");
        ShopingCart bean = context.getBean(ShopingCart.class);
        bean.placeOrder(2000.00);
    }
}