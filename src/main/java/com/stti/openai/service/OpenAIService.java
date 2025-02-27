package com.stti.openai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.stti.openai.config.OpenAIProperties;
import com.stti.openai.dto.ChatRequest;
import com.stti.openai.dto.ChatResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OpenAIService {
    @Autowired
    private final RestTemplate restTemplate;
    @Autowired
    private final OpenAIProperties properties;

    public String generateResponse(String prompt) {
        ChatRequest request = new ChatRequest(properties.getModel(), prompt);
        ChatResponse response = restTemplate.postForObject(
            properties.getApi().getUrl(),
            request,
            ChatResponse.class
        );

        if (response != null && !response.getChoices().isEmpty()) {
            return response.getChoices().get(0).getMessage().getContent();
        }
        return "No response generated.";
    }
}