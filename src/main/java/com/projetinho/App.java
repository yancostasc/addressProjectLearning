package com.projetinho;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App
{
    public static void main(String[] args) {

        new SpringApplicationBuilder(App.class)
                .properties("server.servlet.context-path=/projetinho")
                //.logStartupInfo(false)
                .build()
                .run(args);
    }
}