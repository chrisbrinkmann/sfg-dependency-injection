package com.brinkmcd.sfg.dependency_injection.controllers;

import com.brinkmcd.sfg.dependency_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testConstructorInjectedController(){
        System.out.println(constructorInjectedController.getGreeting());
    }
}