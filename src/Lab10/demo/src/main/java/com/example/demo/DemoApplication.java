package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext conf = new AnnotationConfigApplicationContext(Confclass.class);
//        Programmer pr = (Programmer) conf.getBean("Junior");
//        pr.doCoding();
        Programmer pr1 =  conf.getBean(Senior.class);
        pr1.doCoding();
    }

}
