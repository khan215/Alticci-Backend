package com.practice.alticcisequence.alticcisequence.Utils;

import com.practice.alticcisequence.alticcisequence.Exceptions.GlobalExceptionHandler;
import com.practice.alticcisequence.alticcisequence.Model.BaseResponse;
import org.springframework.stereotype.Component;

@Component
public class Utility {
    public boolean validateInput(String input) {
        boolean flag = false;
            if (input == null || input.equals("")) {
                flag = false;
            }
            else if (input.matches("[0-9]+")) {
                flag = true;
            }
        return flag;
    }

    public BaseResponse buildApiResponse(Integer code, String codeDescription, String message,Object response) {
        return new BaseResponse(code,codeDescription,message,response);
    }

}
