package com.example.user.retrofitexample.responses;

import com.example.user.retrofitexample.Model_inside;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RegistrationResponse {

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
//    @SerializedName("userDetail") // jsonarray name
//    private ArrayList<Model_inside> model_inside = new ArrayList<Model_inside>();
//
//    public ArrayList<Model_inside> getModel_inside() {
//        return model_inside;
//    }
//
//    public void setModel_inside(ArrayList<Model_inside> model_inside) {
//        this.model_inside = model_inside;
//    }


}
