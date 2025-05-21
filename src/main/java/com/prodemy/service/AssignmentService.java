package com.prodemy.service;

import com.prodemy.model.*;
import com.prodemy.repository.AssignmentRepository;
import org.hibernate.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.http.*;
import org.springframework.security.access.prepost.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment createAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getUpcomingAssignments(Long courseId) {
        Course course = new Course();
        course.setCourse_id(courseId);
        return assignmentRepository.findByCourseAndDueDateAfter(course, LocalDateTime.now());
    }
}
