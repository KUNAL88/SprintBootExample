package com.kunal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class HellospringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(HellospringDemoApplication.class, args);

        MyAppConfig myAppConfig=(MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(myAppConfig.toString());
    }

}

