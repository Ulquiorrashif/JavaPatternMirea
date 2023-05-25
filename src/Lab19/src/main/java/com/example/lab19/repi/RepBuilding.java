package com.example.lab19.repi;

import com.example.lab19.entity.Adress;
import com.example.lab19.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepBuilding extends JpaRepository<Building, Long> {
    Building getBuildingByAd(Adress adress);
}
