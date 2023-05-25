package com.example.asdf.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter

public class Building {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String creationDate ;

    private String type;
    @ManyToOne
    @JsonIgnore
    private Adress ad;

    public Building(String first_Name) {
        this.type = first_Name;
    }

    public Building() {
    }
}
