package com.hassanmahmud.diexamples.config;

import com.hassanmahmud.diexamples.examplebean.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${hm.username}")
    String user;

    @Value("${hm.password}")
    String password;

    @Value("${hm.dburl}")
    String dburl;

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        var fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(dburl);
        return fakeDataSource;
    }
}
