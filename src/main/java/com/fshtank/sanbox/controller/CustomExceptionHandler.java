package com.fshtank.sanbox.controller;

import com.fshtank.sanbox.exception.SanboxException;
import com.fshtank.sanbox.model.errors.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    public String ERROR_REQUEST = "ERROR IN REQUEST-RESPONSE";


    /**
     * Exception handler for commonly used shared exception class;
     *
     * @param e
     * @return
     */
    @ExceptionHandler({SanboxException.class})
    public final ResponseEntity<ErrorResponse> handleException(WebRequest request, SanboxException e) {

        List<String> details = new ArrayList<>();
        details.add(e.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(ERROR_REQUEST, details);

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
