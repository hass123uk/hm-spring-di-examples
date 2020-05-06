package com.hassanmahmud.diexamples.controllers;

import com.hassanmahmud.diexamples.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
