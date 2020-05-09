package com.hassanmahmud.diexamples.services;

public class FactorySpanishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public FactorySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
