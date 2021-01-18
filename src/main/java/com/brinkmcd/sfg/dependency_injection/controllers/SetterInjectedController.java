package com.brinkmcd.sfg.dependency_injection.controllers;

import com.brinkmcd.sfg.dependency_injection.services.GreetingService;
import com.brinkmcd.sfg.dependency_injection.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
