package com.practice.alticcisequence.alticcisequence.Controller;

import com.practice.alticcisequence.alticcisequence.Exceptions.GlobalExceptionHandler;
import com.practice.alticcisequence.alticcisequence.Model.BaseResponse;
import com.practice.alticcisequence.alticcisequence.Service.AlticciService;
import com.practice.alticcisequence.alticcisequence.Service.Implementations.AlticciServiceImplementation;
import com.practice.alticcisequence.alticcisequence.Utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@CrossOrigin
@RestController
@RequestMapping("alticci")
public class AlticciSequence {

    @Autowired
    Utility utility;

    @Autowired
    private AlticciService alticciService;

    @GetMapping("/{input}")
    @Cacheable(value="response", key="#input")
    public ResponseEntity<BaseResponse> alticciSequence(@PathVariable String input) {
        if(!utility.validateInput(input)){
            throw new IllegalArgumentException(HttpStatus.BAD_REQUEST.toString());
        }
        BaseResponse baseResponse = alticciService.calculateAlticciSequence(Integer.valueOf(input));
        return ResponseEntity.status(baseResponse.getResponseCode()).body(baseResponse);
    }




}
