package com.example.user.retrofitexample.responses;

import com.example.user.retrofitexample.Model_inside;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OTPResponse {

    @SerializedName("errorCode") // json key
    private String errorCode;

    @SerializedName("errorMessage") // json key
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
