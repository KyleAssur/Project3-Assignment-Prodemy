package com.prodemy.repository;

import com.prodemy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCourse(Course course);
}