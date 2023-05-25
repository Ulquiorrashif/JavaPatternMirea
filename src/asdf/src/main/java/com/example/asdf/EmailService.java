//package com.example.asdf;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;
//
//@Aspect
//@Slf4j
//@Service
//@Async
//public class EmailService {
//
//    @Around("execution(* *save*(..))")
//    public void send (JoinPoint jo){
//        log.info("Отправка сообщения " + jo.getSignature());
//
//    }
//}
