package com.example.lab19.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Entity

@Data
@Component
public class Adress {

    private  String addresText;

    @Id
    private  int zipCode;
    @OneToMany(mappedBy = "ad")
    private List<Building> list = new ArrayList<>();

    public Adress() {
    }

    public void setList(Building bu     ){
        this.list.add(bu);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "addresText='" + addresText + '\'' +
                ", zipCode=" + zipCode +
                ", list=" + list.toString() +
                '}';
    }
}
