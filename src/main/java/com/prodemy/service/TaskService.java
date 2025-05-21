package com.prodemy.service;

import org.hibernate.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.http.*;
import org.springframework.scheduling.config.Task;
import org.springframework.security.access.prepost.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.*;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasksByUserAndStatus(Long userId, Status status) {
        User user = userRepository.findById(userId).orElseThrow();
        return taskRepository.findByUserAndStatus(user, status);
    }
}