package ru.taskmanagement.taskmanagement.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.taskmanagement.taskmanagement.dto.UserDto;
import ru.taskmanagement.taskmanagement.services.UserService;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/users")
@Slf4j
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody UserDto user) {
        return ok(userService.registerUser(user).getId());
    }
}
