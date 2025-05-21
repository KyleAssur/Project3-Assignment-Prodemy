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

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password_hash;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    // Relationships
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<DiscussionMessage> messages;
}