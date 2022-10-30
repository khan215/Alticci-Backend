package com.practice.alticcisequence.alticcisequence.Service.Implementations;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.practice.alticcisequence.alticcisequence.Exceptions.BaseException;
import com.practice.alticcisequence.alticcisequence.Model.BaseResponse;
import com.practice.alticcisequence.alticcisequence.Service.AlticciService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AlticciServiceImplementation implements AlticciService {

    Logger logger = LoggerFactory.getLogger(AlticciServiceImplementation.class);

    @Override
    public BaseResponse calculateAlticciSequence(Integer input) {
        logger.info("Calculating alticci sequence for input : " +input + " started");
        Integer answer = alticciSequenceByRecursion(input);
        logger.info("Calculating alticci sequence for input : " +input + " completed..");
        return new BaseResponse(HttpStatus.OK.value(),"Success","Calculation Processed Successfully",answer);
    }

    private int alticciSequenceByRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return alticciSequenceByRecursion(n-3) + alticciSequenceByRecursion(n-2);
    }
}
