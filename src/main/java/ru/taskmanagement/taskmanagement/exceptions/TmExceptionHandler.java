package ru.taskmanagement.taskmanagement.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class TmExceptionHandler {

    @ExceptionHandler({TmException.class})
    public ResponseEntity<Object> handlerException(Exception ex) throws Exception {
        if (ex instanceof TmException e) {
            log.debug("TmException: status = {}", e.getStatus().name(), e);
            return new ResponseEntity<>(new TmResponseException(e.getStatus().name(), e.getMessage()), e.getStatus());
        } else {
            throw ex;
        }
    }
}
