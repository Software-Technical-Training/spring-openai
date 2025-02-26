package com.stti.openai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.*;

@Configuration
@ConfigurationProperties(prefix = "openai")
@Data
public class OpenAIProperties {
    private String model;
    private Api api = new Api();

    @Data
    public static class Api {
        private String url;
        private String key;
    }
}