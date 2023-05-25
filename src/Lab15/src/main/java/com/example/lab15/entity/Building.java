package com.example.lab15.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Building {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String creationDate ;

    private String type;
    @ManyToOne @JsonIgnore
    private Adress ad;

    public Building(String first_Name) {
        this.type = first_Name;
    }

    public Building() {
    }
}
