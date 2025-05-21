package com.prodemy.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public DiscussionMessage sendMessage(DiscussionMessage message) {
        return message;
    }
}