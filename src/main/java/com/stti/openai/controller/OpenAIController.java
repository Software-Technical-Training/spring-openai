package com.stti.openai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stti.openai.service.OpenAIService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/openai")
@RequiredArgsConstructor
public class OpenAIController {

    private final OpenAIService openAIService;

    @PostMapping("/chat")
    public String generateResponse(@RequestBody String prompt) {
        return openAIService.generateResponse(prompt);
    }
}