package com.prodemy.controller;

import com.prodemy.model.DiscussionMessage;
import com.prodemy.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/discussions")
public class DiscussionMessageController {
    @Autowired
    private DiscussionMessageService messageService;

    @PostMapping
    public ResponseEntity<DiscussionMessage> postMessage(@RequestBody DiscussionMessage message) {
        return ResponseEntity.ok(messageService.postMessage(message));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<DiscussionMessage>> getMessagesByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(messageService.getMessagesByCourse(courseId));
    }
}