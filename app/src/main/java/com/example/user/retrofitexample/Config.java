package com.example.user.retrofitexample;

public interface Config {
    /*
      String BASE_DOMAIN = "http://amphistore.com/clients/alfatimes/index.php?";
      String WEB_BASE_URL = BASE_DOMAIN + "r=apiv1";
      String URL_LOGIN = "/login_device&uname={username}&pwrd={password}";
      */
//ip = 192.168.2.74
    //String BASE_DOMAIN = "http://echo.jsontest.com";
   // String BASE_DOMAIN = "http://192.168.0.30:7777/Service1.svc";
    String BASE_DOMAIN = "http://192.168.0.30:7777/Service1.svc";
    //String WEB_BASE_URL = BASE_DOMAIN ;
    String URL_LOGIN = "/login.php";
    //String URL_REGISTRATION = "/key/value/one/two";
    String URL_REGISTRATION = "/adminRegister";
    String URL_DELIVERY_OR_PICKUP = "/delivery_pickup.php";
    String URL_OTP = "/otp.php";
}

