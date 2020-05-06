package com.hassanmahmud.diexamples;

import com.hassanmahmud.diexamples.controllers.ConstructorInjectedController;
import com.hassanmahmud.diexamples.controllers.MyController;
import com.hassanmahmud.diexamples.controllers.PropertyInjectedController;
import com.hassanmahmud.diexamples.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiExamplesApplication {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(DiExamplesApplication.class, args);

        System.out.println("-------- Primary Bean");

        var myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);


        System.out.println("------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");

        SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");

        System.out.println(setterBasedController.getGreeting());

        System.out.println("------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

    }

}
