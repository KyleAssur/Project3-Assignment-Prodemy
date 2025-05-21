package com.prodemy.controller;

import com.prodemy.model.Assignment;
import com.prodemy.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @PostMapping
    public ResponseEntity<Assignment> createAssignment(@RequestBody Assignment assignment) {
        return ResponseEntity.ok(assignmentService.createAssignment(assignment));
    }

    @GetMapping("/upcoming/course/{courseId}")
    public ResponseEntity<List<Assignment>> getUpcomingAssignments(@PathVariable Long courseId) {
        return ResponseEntity.ok(assignmentService.getUpcomingAssignments(courseId));
    }
}