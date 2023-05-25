//package com.example.asdf;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Service;
//
//@org.aspectj.lang.annotation.Aspect
//@Slf4j
//@Service
//public class Aspect {
//    private long start;
//    private  long end;
//    @Before("within(com.example.asdf.service.*)")
//    public void stime(JoinPoint jo){
//
//        log.info(jo.getArgs().toString());
//
//    }
//    @After("execution(* *save(*))")
//    public void etime(JoinPoint jo){
//
//        log.info("Сохранилось");
//    }
//}
