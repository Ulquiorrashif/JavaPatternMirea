package com.example.asdf.controllers;

import com.example.asdf.entity.Users;
import com.example.asdf.service.UserServicce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserCont {
    private final UserServicce userServicce;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/reg")
    public String regn(){
        return "reg";
    }

    @PostMapping("/reg")
    public String createUser(Users user){
//        Users user = new Users();
//        user.setPassword(pass);
//        user.setEmail(email);
        System.out.println(user.toString());
        userServicce.createUser(user);
        return "redirect:/login";

    }
//    @PostMapping("/login")
//    public String lg(Users user){
////        Users user = new Users();
////        user.setPassword(pass);
////        user.setEmail(email);
//
//        return "redirect:/home";
//
//    }
}
