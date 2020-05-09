package com.hassanmahmud.diexamples.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getDefaultGreeting() {
        return "Huh! Hello?! - from Repository";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello World - from Repository";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo - from Repository";
    }
}
