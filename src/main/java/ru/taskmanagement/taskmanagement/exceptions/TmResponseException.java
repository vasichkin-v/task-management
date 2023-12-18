package ru.taskmanagement.taskmanagement.exceptions;

import lombok.Data;

@Data
public class TmResponseException {
    private String status;
    private String message;

    public TmResponseException(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
