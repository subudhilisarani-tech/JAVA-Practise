package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    public TaskController() {
        tasks.add(new Task(1, "Complete assignment", "pending"));
        tasks.add(new Task(2, "Complete Notes ", "completed"));
        tasks.add(new Task(3, "Practice coding", "in-progress"));
        tasks.add(new Task(4, "Attend Online Class", "pending"));
        tasks.add(new Task(5, "Exam-Preparation", "in-progress"));
    }

    @GetMapping("/task")
    public List<Task> getAllTasks() {
        return tasks;
    }
    @GetMapping("/task/{id}")
    public Task getTaskById(@PathVariable int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
    @GetMapping("/{status}")
    public List<Task> getTasksByStatus(@PathVariable String status) {

        List<Task> result = new ArrayList<>();

        for (Task t : tasks) {
            if (t.getStatus().equalsIgnoreCase(status)) {
                result.add(t);
            }
        }

        return result;
    }

}