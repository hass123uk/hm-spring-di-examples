package com.hassanmahmud.diexamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - i18n - EN";
    }
}
