package ru.taskmanagement.taskmanagement.repositories;

import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.taskmanagement.taskmanagement.models.Task;
import ru.taskmanagement.taskmanagement.models.User;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
//    List<Task> findByAuthorOrAssignee(User author, User assignee, Pageable pageable);
}
