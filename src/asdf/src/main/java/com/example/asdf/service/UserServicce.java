package com.example.asdf.service;

import com.example.asdf.entity.Users;
import com.example.asdf.repi.RepUser;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.Transactional;

@Service
//@AllArgsConstructor
@RequiredArgsConstructor

@ComponentScan
public class UserServicce {
    private final RepUser userp;
    private  final PasswordEncoder passen;
    @Transactional
    public boolean createUser(Users user){

            user.setPassword(passen.encode(user.getPassword()));
            userp.save(user);
//            System.out.println("Вывод"+userp.getUsersByEmail(user.getEmail()));
            return  true;
    }
    @Transactional
    public List<Users> getUsers(){
        List <Users> list = new ArrayList<>();
        userp.findAll().forEach(us->{
            list.add(us);
        });
        return  list;
    }

}
