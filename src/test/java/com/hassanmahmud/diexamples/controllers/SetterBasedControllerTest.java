package com.hassanmahmud.diexamples.controllers;

import com.hassanmahmud.diexamples.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}