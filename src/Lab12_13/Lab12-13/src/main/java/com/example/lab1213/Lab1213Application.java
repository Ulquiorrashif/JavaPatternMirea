package com.example.lab1213;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab1213Application {

    public static void main(String[] args) {
//        ApplicationContext cont = new AnnotationConfigApplicationContext(Lab1213Application.class);
        ConfigurableApplicationContext cont = SpringApplication.run(
                Lab1213Application.class,
                args
        );
        Student st = cont.getBean(Student.class);
        System.out.println(st.getName());
        System.out.println(st.getForname());
        System.out.println(st.getGroup());

    }

}
