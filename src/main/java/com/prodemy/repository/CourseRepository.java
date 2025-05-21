package com.prodemy.repository;

import com.prodemy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCourseNameContaining(String keyword);
}