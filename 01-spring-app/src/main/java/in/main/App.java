package in.main;

import in.beans.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /// started IOC container
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");

        /// get bean obj from IOC
        Engine bean = applicationContext.getBean(Engine.class);

        ///  called bean method
        bean.start();
    }
}
