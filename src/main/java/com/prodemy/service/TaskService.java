package com.prodemy.service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasksByUserAndStatus(Long userId, Status status) {
        User user = userRepository.findById(userId).orElseThrow();
        return taskRepository.findByUserAndStatus(user, status);
    }
}