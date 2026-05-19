package org.witz;

import com.beans.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans-config.xml");
        ProductService bean = context.getBean(ProductService.class);
        bean.service("src\\main\\resources\\products.csv");
        System.out.println("Done! csv saved to database");

    }
}