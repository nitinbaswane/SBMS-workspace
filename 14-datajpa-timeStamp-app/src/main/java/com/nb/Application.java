package com.nb;

import com.nb.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ProductService bean = context.getBean(ProductService.class);
        bean.saveData();

        Thread.sleep(2000);
        bean.updateData();
    }

}
