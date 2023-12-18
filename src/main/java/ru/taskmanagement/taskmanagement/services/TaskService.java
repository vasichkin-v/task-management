package ru.taskmanagement.taskmanagement.services;

import org.springframework.data.domain.Pageable;
import ru.taskmanagement.taskmanagement.models.Comment;
import ru.taskmanagement.taskmanagement.models.Task;
import ru.taskmanagement.taskmanagement.models.User;

import java.util.List;

public interface TaskService {

    Task createTask(Task task);

    Task updateTask(Long taskId, Task task);

    void deleteTask(Long taskId);

    Task getTaskById(Long taskId);

    List<Task> getTasksByUser(User user, Pageable pageable);

    List<Comment> getCommentsByTask(Task task, Pageable pageable);
}
