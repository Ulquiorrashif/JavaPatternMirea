package com.example.lab19.service;

import com.example.lab19.entity.Adress;
import com.example.lab19.entity.Building;
import com.example.lab19.repi.RepAdress;
import com.example.lab19.repi.RepBuilding;
//import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
@Slf4j
public class BuildingService {
    private RepBuilding repb;

    @Transactional
    public void savewitBuil(Building building, Adress ad){
        log.info("Сохранился билдинг со связкой");

        building.setAd(ad);
        repb.save(building);
    }
}
