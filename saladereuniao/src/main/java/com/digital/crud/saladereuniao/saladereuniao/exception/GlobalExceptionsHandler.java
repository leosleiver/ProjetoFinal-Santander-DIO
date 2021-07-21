package com.digital.crud.saladereuniao.saladereuniao.exception;


import lombok.Data;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@Data
@ControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler( ResourceNotFoundException.class)
    public ResponseEntity resourceNotFoundException(NullPointerException ex, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails(new Date(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler( Exception.class)
    public ResponseEntity<?>globalExceptionHandler(Exception ex,WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails(new Date(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}