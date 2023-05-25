package com.example.lab14.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Component
public class Adress {
    @Value("krotuiadress")
    private  String addresText;

    private  int zipCode=12;

    @Override
    public String toString() {
        return "Adress{" +
                "addresText='" + addresText + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
