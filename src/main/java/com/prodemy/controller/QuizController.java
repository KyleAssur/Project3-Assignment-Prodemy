package com.prodemy.controller;

import com.prodemy.model.Quiz;
import com.prodemy.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api/quizzes")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(quizService.createQuiz(quiz));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Quiz>> getQuizzesByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(quizService.getQuizzesByCourse(courseId));
    }
}