package com.practice.alticcisequence.alticcisequence.Exceptions;

import com.practice.alticcisequence.alticcisequence.Model.BaseResponse;
import com.practice.alticcisequence.alticcisequence.Utils.Constants;
import com.practice.alticcisequence.alticcisequence.Utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception {

    @Autowired
    private Utility utility;

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ResponseEntity<BaseResponse> invalidInputException(IllegalArgumentException ex) {
        return new ResponseEntity<>(utility.buildApiResponse(HttpStatus.BAD_REQUEST.value(),
                Constants.apiMessageInvalidInputError,"You input contains invalid input, please try with valid number..", null), HttpStatus.BAD_REQUEST);
    }
}
