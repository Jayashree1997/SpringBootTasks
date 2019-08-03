package com.stackroute.trackservice.exceptions;

import com.stackroute.trackservice.domain.Track;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value=TrackAlreadyExistsException.class)
    public ResponseEntity<String> exceptionHandler(TrackAlreadyExistsException e){
        return new ResponseEntity<>("exception occured"+e.getMessage(), HttpStatus.CONFLICT);
    }
}
