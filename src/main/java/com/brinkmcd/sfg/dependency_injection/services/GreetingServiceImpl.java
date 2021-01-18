package com.brinkmcd.sfg.dependency_injection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there!";
    }
}
