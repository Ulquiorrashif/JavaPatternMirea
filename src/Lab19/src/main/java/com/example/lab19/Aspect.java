package com.example.lab19;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@org.aspectj.lang.annotation.Aspect
@Slf4j
@Service
public class Aspect {
    private long start;
    private  long end;
    @Before("within(com.example.lab19.service.*)")
    public void stime(JoinPoint jo){
        start=System.nanoTime();
        log.info(" Имя метода  "+jo.getSignature().getName()+" Параметры  "+jo.getArgs().toString());

    }
    @After("within(com.example.lab19.service.*)")
    public void etime(JoinPoint jo){
        end=System.nanoTime();
        log.info(" Время выполнения : "+jo.getSignature().getName()+(end-start)+"nano s ");
    }
}
