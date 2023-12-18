package ru.taskmanagement.taskmanagement.services;

import ru.taskmanagement.taskmanagement.dto.UserDto;
import ru.taskmanagement.taskmanagement.models.User;

public interface UserService {

    User registerUser(UserDto user);

    User loginUser(String email, String password);

    User getUserById(Long userId);
}
