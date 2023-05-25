package com.example.demo;

import com.example.demo.Programmer;
import org.springframework.stereotype.Component;

@Component
public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Coding com.example.demo.Middle");
    }
}
