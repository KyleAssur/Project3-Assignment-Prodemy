package com.prodemy.service;

import com.prodemy.model.*;
import com.prodemy.repository.VideoLectureRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class VideoLectureService {
    @Autowired
    private VideoLectureRepository videoLectureRepository;

    public VideoLecture createLecture(VideoLecture lecture) {
        return videoLectureRepository.save(lecture);
    }

    public List<VideoLecture> getLecturesByCourse(Long courseId) {
        Course course = new Course();
        course.setCourse_id(courseId);
        return videoLectureRepository.findByCourse(course);
    }
}