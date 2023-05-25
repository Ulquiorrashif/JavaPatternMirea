package com.example.lab14.Controllers;

import com.example.lab14.Entity.Adress;
import com.example.lab14.Services.Services;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adress")
@Component
public class ACont {

    private Services serv;

    public ACont(Services serv) {
        this.serv = serv;
    }

    @GetMapping("/che")
    public String start(){
        return serv.toString();
    }
//    @PostMapping("/add/{ad}/{item}")
//    public String add (@PathVariable String ad,@PathVariable int item ){
//        serv.add(new Adress(ad, item));
//        return "Alles";
//    }
    @PostMapping("/add")
    public String add (@RequestParam(defaultValue = "lo") String ad,@RequestParam(defaultValue = "12") int  item ){
        serv.add(new Adress(ad, item));
        return "Alles";
    }

}
