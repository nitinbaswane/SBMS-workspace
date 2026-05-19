package org.main;

import com.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
      Car c= context.getBean(Car.class);
      c.drive();
    }
}
