package com.hassanmahmud.diexamples.controllers;

import com.hassanmahmud.diexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryBasedController {
    private final GreetingService greetingService;

    public FactoryBasedController(@Qualifier("factoryGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
