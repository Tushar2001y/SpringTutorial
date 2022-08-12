package com.example.test.customevent;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class CustomEventHandlerApp{
public static void main(String[] args) {
        ConfigurableApplicationContext context =
        new ClassPathXmlApplicationContext("BeanCustomEvent.xml");

        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
}
}