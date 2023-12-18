package ru.taskmanagement.taskmanagement.services;
import java.util.HashSet;

import org.springframework.http.HttpStatus;
import ru.taskmanagement.taskmanagement.enums.Role;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.taskmanagement.taskmanagement.dto.UserDto;
import ru.taskmanagement.taskmanagement.exceptions.TmException;
import ru.taskmanagement.taskmanagement.models.User;
import ru.taskmanagement.taskmanagement.repositories.UserRepository;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User registerUser(UserDto user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new TmException(String.format("Пользователь с email: %s уже существует", user.getEmail()), BAD_REQUEST);
        }
        return userRepository.save(user.toUser());
    }

    @Override
    public User loginUser(String email, String password) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }
}
