package com.prodemy.model;

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