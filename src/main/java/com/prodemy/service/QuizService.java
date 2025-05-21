package com.prodemy.service;

import com.prodemy.model.*;
import com.prodemy.repository.QuizRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> getQuizzesByCourse(Long courseId) {
        Course course = new Course();
        course.setCourse_id(courseId);
        return quizRepository.findByCourse(course);
    }
}