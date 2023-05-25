package com.example.asdf.repi;

import com.example.asdf.entity.Adress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepAdress extends CrudRepository<Adress,Long> {
    Adress getAdressByZipCode(int zipCode);
    List<Adress> findAdressesByAddresTextContainingIgnoreCase(String param);
}
