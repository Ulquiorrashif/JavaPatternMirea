package com.example.demo;

import com.example.demo.Programmer;
import org.springframework.stereotype.Component;

@Component
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Coding com.example.demo.Senior");
    }
}
