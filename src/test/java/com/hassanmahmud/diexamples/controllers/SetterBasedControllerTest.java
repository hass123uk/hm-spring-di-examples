package com.hassanmahmud.diexamples.controllers;

import com.hassanmahmud.diexamples.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterBasedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}