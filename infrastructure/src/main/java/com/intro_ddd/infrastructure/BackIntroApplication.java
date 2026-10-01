package com.intro_ddd.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.intro_ddd" })
public class BackIntroApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackIntroApplication.class, args);
    }
}
