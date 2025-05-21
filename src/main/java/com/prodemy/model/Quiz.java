package com.prodemy.model;

import com.prodemy.service.*;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.http.*;
import org.springframework.scheduling.config.Task;
import org.springframework.security.access.prepost.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;

@Entity
@Table(name = "quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quiz_id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(nullable = false)
    private String title;

    @Column(name = "time_limit_minutes")
    private int timeLimitMinutes;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;

    // Getters, setters, constructors
}