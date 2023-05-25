package com.example.lab14.Services;

import com.example.lab14.Entity.Adress;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class Services {
    private List<Adress> list=new ArrayList<>();
    public void add( Adress adress){
        list.add(adress);
    }


    @Override
    public String toString() {
        String res="";
//        fun func=new fun() {
//            @Override
//            public String annotationType(Object a, String res) {
//                res+=a.toString()+"\n ";
//                return res;
//            }
//        };
//        list.forEach((a)->{
//            func.annotationType(a,res);
//        });
        for (Adress i : list){
            res+=i.toString()+"\n";
        }
        return "Services{" +
                "list=" + res +
                '}';
    }


}
