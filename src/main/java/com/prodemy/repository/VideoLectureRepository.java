package com.prodemy.repository;

import com.prodemy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface VideoLectureRepository extends JpaRepository<VideoLecture, Long> {
    List<VideoLecture> findByCourse(Course course);
}