package com.example.test.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class AspectDemo {
    @Before("execution(public void getMessage())")
    public void show(){
        System.out.println("this has been printed from the aspect");
    }
}
