package com.revature.project21;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.PropertySource;

@org.springframework.boot.autoconfigure.SpringBootApplication
@PropertySource("dev.properties")
public class SpringBootApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootApplication.class, args);
    }

}
