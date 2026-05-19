package com.nb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class Motor {

    public Motor(){
        System.out.println("motor::constructor");

    }

    @PostConstruct
    public void start(){
        System.out.println("motor started.....");

    }
    public void doWork(){
        System.out.println("motor stoppped 🟨");

    }
    @PreDestroy
    public void stop(){
        System.out.println("motor stoppped 🛑");
    }
}
