package ru.taskmanagement.taskmanagement.dto;

import lombok.Getter;
import ru.taskmanagement.taskmanagement.enums.Role;
import ru.taskmanagement.taskmanagement.models.User;

import java.util.Set;

@Getter
public class UserDto {
    private String email;
    private String password;
    private Set<Role> roles;

    public User toUser() {
        User user = new User();
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setRoles(this.roles);
        return user;
    }
}
