package com.example.lab15.repi;

import com.example.lab15.entity.Adress;
import com.example.lab15.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepBuilding extends JpaRepository<Building, Long> {
    Building getBuildingByAd(Adress adress);
}
