package com.example.asdf.repi;

import com.example.asdf.entity.Adress;
import com.example.asdf.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepBuilding extends JpaRepository<Building, Long> {
    Building getBuildingByAd(Adress adress);
}
