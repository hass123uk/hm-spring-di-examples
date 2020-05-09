package com.hassanmahmud.diexamples.services;

public class FactoryEnglishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public FactoryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
