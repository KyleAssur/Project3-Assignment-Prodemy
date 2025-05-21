package com.prodemy.model;

import com.prodemy.service.*;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.http.*;
import org.springframework.scheduling.config.Task;
import org.springframework.security.access.prepost.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "video_lectures")
public class VideoLecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lecture_id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(nullable = false)
    private String title;

    @Column(name = "video_url", nullable = false)
    private String videoUrl;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "duration_minutes")
    private int durationMinutes;

    // Getters, setters, constructors
}