package com.example.lab1213;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.forname}")
    private String forname;
    @Value("${student.group}")
    private String group;

    public String getName() {
        return name;
    }

    public String getForname() {
        return forname;
    }

    public String getGroup() {
        return group;
    }
}
