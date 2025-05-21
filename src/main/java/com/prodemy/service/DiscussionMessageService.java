package com.prodemy.service;

import com.prodemy.model.*;
import com.prodemy.repository.DiscussionMessageRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;


@Service
public class DiscussionMessageService {
    @Autowired
    private DiscussionMessageRepository messageRepository;

    public DiscussionMessage postMessage(DiscussionMessage message) {
        message.setSentAt(LocalDateTime.now());
        return messageRepository.save(message);
    }

    public List<DiscussionMessage> getMessagesByCourse(Long courseId) {
        Course course = new Course();
        course.setCourse_id(courseId);
        return messageRepository.findByCourseOrderBySentAtDesc(course);
    }
}
