package com.hassanmahmud.diexamples.services;

import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
