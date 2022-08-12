package com.example.test.insertcollection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InsertCollectionApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanInsertCollection.xml");
        JavaCollection javac = (JavaCollection) context.getBean("javaCollection");
        javac.getAddressList();
        javac.getAddressProp();
        javac.getAddressMap();
        javac.getAddressSet();
    }
}
