package com.practice.alticcisequence.alticcisequence.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {

    private Integer responseCode;
    private String responseCodeDescription;
    private String message;
    private Object response;

    @Override
    public String toString() {
        return "BaseResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", responseCodeDescription='" + responseCodeDescription + '\'' +
                ", message='" + message + '\'' +
                ", response=" + response +
                '}';
    }
}
