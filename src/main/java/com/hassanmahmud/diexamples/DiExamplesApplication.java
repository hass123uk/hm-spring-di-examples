package com.hassanmahmud.diexamples;

import com.hassanmahmud.diexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiExamplesApplication {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(DiExamplesApplication.class, args);

        var myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
