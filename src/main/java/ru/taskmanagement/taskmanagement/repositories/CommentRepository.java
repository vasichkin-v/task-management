package ru.taskmanagement.taskmanagement.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.taskmanagement.taskmanagement.models.Comment;
import ru.taskmanagement.taskmanagement.models.Task;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTask(Task task, Pageable pageable);
}
