package com.prodemy.repository;

import com.prodemy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserAndStatus(User user, Status status);
}