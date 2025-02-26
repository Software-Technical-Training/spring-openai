package com.stti.openai.dto;

import java.util.List;
import lombok.Data;

@Data
public class ChatResponse {
    private List<Choice> choices;

    @Data
    public static class Choice {
        private ChatRequest.Message message;
    }
}