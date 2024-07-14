package com.example.springboot_ai_ollama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_ai_ollama.service.LlamaAiService;

@RestController
public class AIController {

    @Autowired
    private LlamaAiService aiService;

    @GetMapping("/api/v1/generate")
    public String generate(@RequestParam(value = "promptMessage") String promptMessage) {
        return aiService.generateResult(promptMessage);
    }
}
