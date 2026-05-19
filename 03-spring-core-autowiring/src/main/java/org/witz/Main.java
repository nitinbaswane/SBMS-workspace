package org.witz;

import com.nb.config.AppConfig;
import com.nb.service.ShopingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        ShopingCart bean = context.getBean(ShopingCart.class);
        bean.placeOrder();

    }
}