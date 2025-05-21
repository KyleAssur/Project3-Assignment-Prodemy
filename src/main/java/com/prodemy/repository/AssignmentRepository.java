package com.prodemy.repository;

import com.prodemy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.*;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByCourseAndDueDateAfter(Course course, LocalDateTime now);
}