package com.example.demo.person;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execute(public void com.example.demo.person.Boy.runSomething())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Open door");
    }
}
