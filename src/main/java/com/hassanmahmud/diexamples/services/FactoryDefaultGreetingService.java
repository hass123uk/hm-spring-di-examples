package com.hassanmahmud.diexamples.services;

public class FactoryDefaultGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public FactoryDefaultGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getDefaultGreeting();
    }
}
