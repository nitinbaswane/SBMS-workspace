package org.witz;


import com.beans.ATM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans-config.xml");
        ATM bean = context.getBean(ATM.class);
        bean.withdraw();
    }
}