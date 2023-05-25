package com.example.lab19.repi;

import com.example.lab19.entity.Adress;
import com.example.lab19.entity.Adress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepAdress extends CrudRepository<Adress,Long> {
    Adress getAdressByZipCode(int zipCode);
    List<Adress> findAdressesByAddresTextContainingIgnoreCase(String param);
}
