package com.nb;

import com.nb.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        UserService bean = context.getBean(UserService.class);

        bean.saveData();

        Thread.sleep(5000);

        bean.updateData();
    }

}
