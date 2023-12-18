package ru.taskmanagement.taskmanagement.services;

import ru.taskmanagement.taskmanagement.models.Comment;

public interface CommentService {
    Comment addComment(Long taskId, Comment comment);
}
