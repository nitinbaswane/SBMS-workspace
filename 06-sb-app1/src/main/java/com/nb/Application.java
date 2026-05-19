package com.nb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
///this includes :
///@SpringBootConfiguration
///@ComponentScan(basePackages = "com.nb")
///@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
