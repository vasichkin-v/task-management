package ru.taskmanagement.taskmanagement.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class TmException extends RuntimeException {
    private HttpStatus status;

    public TmException () {
        super();
    }

    public TmException (String message) {
        super(message);
    }

    public TmException (String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
