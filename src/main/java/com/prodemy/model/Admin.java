package com.prodemy.model;

import com.prodemy.service.*;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.http.*;
import org.springframework.security.access.prepost.*;
import org.springframework.web.bind.annotation.*;


import javax.persistence.*;
import java.util.*;

// Admin.java
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;  // Link to User entity

    @Enumerated(EnumType.STRING)
    private AdminLevel level;  // Enum: SUPER_ADMIN, CONTENT_MODERATOR

    @Column(name = "can_manage_users")
    private boolean canManageUsers;

    @Column(name = "can_moderate_content")
    private boolean canModerateContent;

    // Getters, setters, constructors
}