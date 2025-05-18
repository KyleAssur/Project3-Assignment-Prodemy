package com.prodemy.model;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    @Column(nullable = false)
    private String course_name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @CreationTimestamp
    private LocalDateTime created_at;

    // Relationships
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<VideoLecture> lectures;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Assignment> assignments;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Quiz> quizzes;
}