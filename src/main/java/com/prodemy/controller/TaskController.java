package com.prodemy.controller;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/user/{userId}")
    public List<Task> getUserTasks(@PathVariable Long userId) {
        return taskService.getTasksByUserAndStatus(userId, Status.TODO);
    }
}
