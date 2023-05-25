package com.example.asdf.service;

import com.example.asdf.entity.Adress;
import com.example.asdf.entity.Building;
import com.example.asdf.repi.RepBuilding;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//import javax.transaction.Transactional;


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
