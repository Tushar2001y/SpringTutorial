package com.example.test.beanlifecycle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifeCycleApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");

        HloWorld obj = (HloWorld) context.getBean("hloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
