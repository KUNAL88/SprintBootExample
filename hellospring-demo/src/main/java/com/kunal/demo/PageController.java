package com.kunal.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {


    @Value("${pageController.msg}")
   private String pageControllerMsg;

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String appDescription;

    @RequestMapping("/")
    public String hello(){

        return pageControllerMsg+"\n "+appName+"\n "+appDescription;
    }
}
