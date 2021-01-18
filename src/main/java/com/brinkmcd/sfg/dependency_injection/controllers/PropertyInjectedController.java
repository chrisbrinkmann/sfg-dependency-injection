package com.brinkmcd.sfg.dependency_injection.controllers;

import com.brinkmcd.sfg.dependency_injection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
