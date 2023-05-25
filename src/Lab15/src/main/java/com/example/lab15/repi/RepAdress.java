package com.example.lab15.repi;

import com.example.lab15.entity.Adress;
import com.example.lab15.entity.Building;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepAdress extends CrudRepository<Adress,Long> {
    Adress getAdressByZipCode(int zipCode);
    List<Adress> findAdressesByAddresTextContainingIgnoreCase(String param);
}
