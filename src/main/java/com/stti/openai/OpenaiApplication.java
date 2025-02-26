package com.stti.openai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class OpenaiApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenaiApplication.class, args);
    }
}
