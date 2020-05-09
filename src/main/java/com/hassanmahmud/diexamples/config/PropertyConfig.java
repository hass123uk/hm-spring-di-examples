package com.hassanmahmud.diexamples.config;

import com.hassanmahmud.diexamples.examplebean.FakeDataSource;
import com.hassanmahmud.diexamples.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    private final Environment environment;

    @Value("${hm.username}")
    String username;

    @Value("${hm.password}")
    String password;

    @Value("${hm.url}")
    String url;

    @Value("${hm.jms.username}")
    String jmsUsername;

    @Value("${hm.jms.password}")
    String jmsPassword;

    @Value("${hm.jms.url}")
    String jmsUrl;

    public PropertyConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        var fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(environment.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        var fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
