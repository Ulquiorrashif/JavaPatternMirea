package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Coding com.example.demo.Junior");
    }
}
