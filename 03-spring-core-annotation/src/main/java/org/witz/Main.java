package org.witz;

import com.nitz.config.AppConfig;
import com.nitz.security.SecurityService;
import com.nitz.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean = context.getBean(UserService.class);
        String name = bean.getName(102);
        System.out.println(name);
        bean.securityPro();


    }
}