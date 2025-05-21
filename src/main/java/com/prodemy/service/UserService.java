package com.prodemy.service;

import com.prodemy.model.User;
import org.hibernate.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.http.*;
import org.springframework.security.access.prepost.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        user.setPassword_hash(BCrypt.hashpw(user.getPassword_hash(), BCrypt.gensalt()));
        return userRepository.save(user);
    }
}
