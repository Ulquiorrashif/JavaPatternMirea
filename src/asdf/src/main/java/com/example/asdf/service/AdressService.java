package com.example.asdf.service;

import com.example.asdf.entity.Adress;
import com.example.asdf.repi.RepAdress;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//import javax.transaction.Transactional;


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
