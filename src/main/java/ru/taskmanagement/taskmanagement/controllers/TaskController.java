package ru.taskmanagement.taskmanagement.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.taskmanagement.taskmanagement.models.Task;
import ru.taskmanagement.taskmanagement.models.User;
import ru.taskmanagement.taskmanagement.services.TaskService;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController()
@RequestMapping(value = "/api/tasks", produces = "application/json")
@Slf4j
@AllArgsConstructor
public class TaskController {

  private TaskService taskService;

  @PostMapping
  public Long createTask(@RequestBody Task task) {
    if(task.getTitle().isEmpty()) throw new RuntimeException("Заголовок не должен быть пустым");
    Task createdTask = taskService.createTask(task);
    log.debug("Задача создана [{}]", createdTask);
    return createdTask.getId();
  }

  @GetMapping("/{taskId}")
  public ResponseEntity<Task> getTask(@PathVariable(name = "taskId") Long taskId) {
    return ok(taskService.getTaskById(taskId));
  }

  @PutMapping("/{taskId}")
  public void changeTask() {
    log.debug("Приветы! Это changeTask");
  }

  @DeleteMapping("/{taskId}")
  public void deleteTask() {
    log.debug("Приветы! Это deleteTask");
  }
}
