package com.happytailsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan( basePackages = "com.happytailsbackend.controller")
public class HappyTailsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyTailsBackendApplication.class, args);
    }

}
