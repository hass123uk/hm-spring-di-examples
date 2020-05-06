package com.hassanmahmud.diexamples.controllers;

import com.hassanmahmud.diexamples.services.GreetingService;

public class SetterBasedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
