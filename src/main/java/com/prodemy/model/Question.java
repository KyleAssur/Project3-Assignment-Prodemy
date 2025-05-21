package com.prodemy.model;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long question_id;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;

    @Column(name = "question_text", nullable = false)
    private String questionText;

    @Column(name = "correct_answer", nullable = false)
    private String correctAnswer;

    // Getters, setters, constructors
}