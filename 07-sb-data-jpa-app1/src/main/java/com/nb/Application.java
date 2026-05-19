package com.nb;

import com.nb.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.nb.repo")
//@ComponentScan(basePackages = "com.nb")
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        UserService bean = context.getBean(UserService.class);
        System.out.println("RunTime class provided by CrudRepository interface::: "+bean.test());
//        bean.saveUser();
//        bean.saveAllUsers();
//        bean.getUserById(102);
//        bean.getUsers();
//        bean.getUsersById();
//        bean.getRecordCount();
//        bean.isExist();
//        bean.deleteUser(111);
//        bean.deleteUsersById();
//        bean.getUserByGender();
//        bean.getUserByGenderandcity();
//        bean.getUserInfoAgeGreaaterThan();
//        bean.getAllDataWithQuery();
//        bean.deleteUser();

    }

}
