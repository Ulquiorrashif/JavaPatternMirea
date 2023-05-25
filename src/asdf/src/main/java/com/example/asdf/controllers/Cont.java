package com.example.asdf.controllers;

import com.example.asdf.entity.Adress;
import com.example.asdf.entity.Building;
import com.example.asdf.repi.RepAdress;
import com.example.asdf.repi.RepBuilding;
import com.example.asdf.service.AdressService;
import com.example.asdf.service.BuildingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home")
@AllArgsConstructor
public class Cont {
    private RepAdress repa;
    private RepBuilding repb;
    private AdressService sera;
    private BuildingService serb;



    @GetMapping()
    public String start(){
        return "index";
    }
    @PostMapping("/add")
    private String  add(@ModelAttribute("adress") Adress ad, @ModelAttribute("building") Building bu){
        System.out.println(ad.toString());


        sera.save(ad);
        serb.savewitBuil(bu,ad);

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
