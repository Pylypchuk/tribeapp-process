package com.tribeapp.process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProcessApplication {

    public static void main(final String[] args) {
        System.out.println("Process application started");
        SpringApplication.run(ProcessApplication.class, args);
    }
}
