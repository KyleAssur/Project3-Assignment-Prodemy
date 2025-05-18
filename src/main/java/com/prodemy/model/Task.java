package com.prodemy.model;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long task_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority;  // Enum: HIGH, MEDIUM, LOW

    @Enumerated(EnumType.STRING)
    private Status status;      // Enum: TODO, IN_PROGRESS, DONE

    private LocalDate due_date;

    @CreationTimestamp
    private LocalDateTime created_at;
}