package com.example.lab19.service;

import com.example.lab19.entity.Adress;
import com.example.lab19.repi.RepAdress;
//import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
@Slf4j
public class AdressService {
    private RepAdress repa;
    @Transactional
    public void save(Adress ad){
        log.info("Сохранился адрес");
        repa.save(ad);
    }
}
