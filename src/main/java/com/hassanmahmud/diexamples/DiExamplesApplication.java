package com.hassanmahmud.diexamples;

import com.hassanmahmud.diexamples.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiExamplesApplication {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(DiExamplesApplication.class, args);

        System.out.println("------- Default Profiles");
        var defaultProfiles = ctx.getEnvironment().getDefaultProfiles();
        for (String profile : defaultProfiles) {
            System.out.println(profile + ", ");
        }

        System.out.println("------- Active Profiles");
        var activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            System.out.println(profile + ", ");
        }

        System.out.println("-------- Factory services");
        FactoryBasedController factoryBasedController =
                ctx.getBean("factoryBasedController", FactoryBasedController.class);
        System.out.println(factoryBasedController.sayHello());

        System.out.println("-------- I18n Controller");
        I18nController i18NController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18NController.sayHello());

        System.out.println("-------- Primary Bean");
        var myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("------- Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");
        SetterBasedController setterBasedController =
                (SetterBasedController) ctx.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());

        System.out.println("------- Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
