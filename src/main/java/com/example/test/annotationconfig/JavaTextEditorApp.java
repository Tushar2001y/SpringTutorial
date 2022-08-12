package com.example.test.annotationconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaTextEditorApp {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
                TextEditor te = context.getBean(TextEditor.class);
        te.spellCheck();
    }
}
