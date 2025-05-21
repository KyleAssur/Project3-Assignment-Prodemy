package com.prodemy.model;


import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "discussion_messages")
public class DiscussionMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long message_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String message;

    @Column(name = "sent_at", nullable = false)
    private LocalDateTime sentAt;

    // Getters, setters, constructors
}
