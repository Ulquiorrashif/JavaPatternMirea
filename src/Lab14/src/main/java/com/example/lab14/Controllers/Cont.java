package com.example.lab14.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class Cont {
    @GetMapping("/start")
//    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String getHome(){
        return "index";
    }
}
