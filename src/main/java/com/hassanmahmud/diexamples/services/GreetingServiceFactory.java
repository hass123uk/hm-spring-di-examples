package com.hassanmahmud.diexamples.services;

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new FactoryEnglishGreetingService(greetingRepository);
            case "es":
                return new FactorySpanishGreetingService(greetingRepository);
            default:
                return new FactoryDefaultGreetingService(greetingRepository);
        }
    }
}