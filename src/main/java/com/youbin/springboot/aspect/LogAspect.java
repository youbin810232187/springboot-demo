package com.youbin.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class LogAspect {
    private  Logger logger = LoggerFactory.getLogger(LogAspect.class);


    @Around("execution(* com.youbin.springboot.controller.HelloController.*(..))")
    public Object simpleLog(ProceedingJoinPoint pjp){
        Object o = null;
        try {
            Object[] args = pjp.getArgs();
            logger.info(args.toString());
            o = pjp.proceed();
            logger.info("return:" + o.toString());
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return  o;
    }
}
