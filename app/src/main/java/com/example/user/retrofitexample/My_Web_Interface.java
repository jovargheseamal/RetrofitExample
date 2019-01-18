package com.example.user.retrofitexample;

import com.example.user.retrofitexample.responses.OTPResponse;
import com.example.user.retrofitexample.responses.RegistrationResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

public interface My_Web_Interface {

    @POST(Config.URL_REGISTRATION)
    void web_registerUser(@Query("OwnerName") String namee,@Query("Address") String namee1,@Query("ContactNo") String namee2,
                          @Query("EmailId") String namee3,@Query("UserName") String namee4,@Query("Password") String namee5,
                          Callback<RegistrationResponse> registrationCallback);

   /* @GET("/Service1.svc/{userid}/getuser")
    void web_registerUser(@Path("userid") String namee, Callback<RegistrationResponse> registrationCallback);*/



    @GET(Config.URL_OTP)
    void callOTP(@Path("one") String namee, @Path("two") String mobilee, Callback<OTPResponse> registrationCallback);

}
