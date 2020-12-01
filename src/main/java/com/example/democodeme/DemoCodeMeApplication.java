package com.example.democodeme;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCodeMeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoCodeMeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");
    }
}
