package com.prodemy.repository;

import com.prodemy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface DiscussionMessageRepository extends JpaRepository<DiscussionMessage, Long> {
    List<DiscussionMessage> findByCourseOrderBySentAtDesc(Course course);
}