package com.stti.openai.dto;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
public class ChatRequest {
    private String model;
    private List<Message> messages;

    public ChatRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }

    @Data
    @AllArgsConstructor
    public static class Message {
        private String role;
        private String content;
    }
}