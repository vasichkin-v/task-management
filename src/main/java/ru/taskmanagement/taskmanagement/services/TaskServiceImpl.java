package ru.taskmanagement.taskmanagement.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import ru.taskmanagement.taskmanagement.exceptions.TmException;
import ru.taskmanagement.taskmanagement.models.Comment;
import ru.taskmanagement.taskmanagement.models.Task;
import ru.taskmanagement.taskmanagement.models.User;
import ru.taskmanagement.taskmanagement.repositories.TaskRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long taskId, Task task) {
        return null;
    }

    @Override
    public void deleteTask(Long taskId) {

    }

    @Override
    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElseThrow(()-> new TmException("Задача не найдена", HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Task> getTasksByUser(User user, Pageable pageable) {
        return null;
    }

    @Override
    public List<Comment> getCommentsByTask(Task task, Pageable pageable) {
        return null;
    }
}
