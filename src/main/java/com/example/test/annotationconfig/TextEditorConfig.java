package com.example.test.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TextEditorConfig {
    @Bean
    @Scope("prototype")
    public TextEditor textEditor(){
        return new TextEditor(new SpellChecker());
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }

}
