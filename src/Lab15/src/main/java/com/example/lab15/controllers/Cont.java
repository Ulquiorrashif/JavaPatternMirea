package com.example.lab15.controllers;

import com.example.lab15.entity.Adress;
import com.example.lab15.entity.Building;

import com.example.lab15.repi.RepAdress;
import com.example.lab15.repi.RepBuilding;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home")
public class Cont {
    private RepAdress repa;
    private RepBuilding repb;

    public Cont(RepAdress repa, RepBuilding repb) {
        this.repa = repa;
        this.repb = repb;
    }

    @GetMapping()
    public String start(){
        return "index";
    }
    @PostMapping("/add")
    private String  add(@ModelAttribute("adress") Adress ad, @ModelAttribute("building") Building bu){
        System.out.println(ad.toString());


        repa.save(ad);
        bu.setAd(ad);
        repb.save(bu);

        return "index";

    }
    @GetMapping("/show/{id}")
    public @ResponseBody List show (@PathVariable("id") int zipCode  ){
//        return repb.getBuildingByAd( repa.getAdressByZipCode(zipCode)).toString();
//        System.out.println(repa.getAdressByZipCode(zipCode).toString());
//        return "ne ponimai";

        return repa.getAdressByZipCode(zipCode).getList();
    }
    @GetMapping("/showby/{filter}")
    public @ResponseBody List showby (@PathVariable("filter") String param  ){
//        return repb.getBuildingByAd( repa.getAdressByZipCode(zipCode)).toString();
//        System.out.println(repa.getAdressByZipCode(zipCode).toString());
//        return "ne ponimai";

        return repa.findAdressesByAddresTextContainingIgnoreCase(param);
    }
}
