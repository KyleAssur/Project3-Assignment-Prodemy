package com.prodemy.controller;

import com.prodemy.model.VideoLecture;
import com.prodemy.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/lectures")
public class VideoLectureController {
    @Autowired
    private VideoLectureService videoLectureService;

    @PostMapping
    public ResponseEntity<VideoLecture> createLecture(@RequestBody VideoLecture lecture) {
        return ResponseEntity.ok(videoLectureService.createLecture(lecture));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<VideoLecture>> getLecturesByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(videoLectureService.getLecturesByCourse(courseId));
    }
}
