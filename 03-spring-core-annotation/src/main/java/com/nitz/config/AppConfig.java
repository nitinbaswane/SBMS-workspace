package com.nitz.config;

import com.nitz.security.SecurityService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.nitz")
public class AppConfig {
    @Bean

//    @Scope("prototype") /// singleton is default scope , no need to mention @scope("singleton")
    public SecurityService security(){
        SecurityService ss =new SecurityService();
        return ss;
    }
}
