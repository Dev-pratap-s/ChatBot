package com.cfs.gemii.controller;

import com.cfs.gemii.services.AiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("*")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String,String> body) {

        String question = body.get("question");

        return aiService.getResponseFromAI(question);
    }
}
