package com.brinkmcd.sfg.dependency_injection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello there!");

        return "Hello there!!";
    }
}
