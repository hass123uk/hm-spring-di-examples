package com.hassanmahmud.diexamples.config;

import com.hassanmahmud.diexamples.services.GreetingRepository;
import com.hassanmahmud.diexamples.services.GreetingService;
import com.hassanmahmud.diexamples.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean(name = "factoryGreetingService")
    @Profile("EN")
    GreetingService factoryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean(name = "factoryGreetingService")
    @Profile("ES")
    GreetingService factorySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean(name = "factoryGreetingService")
    @Profile("default")
    GreetingService factoryDefaultGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("other");
    }
}
