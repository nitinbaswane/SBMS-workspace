package org.witz;

import com.beans.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans-config.xml");
        UserService bean = context.getBean(UserService.class);
        bean.register("nitin@gmail.com","3684126512tyjnn");
    }
}