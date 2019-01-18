package com.example.user.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.user.retrofitexample.responses.OTPResponse;
import com.example.user.retrofitexample.responses.RegistrationResponse;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;

public class MainActivity extends AppCompatActivity {


    My_Web_Interface myWebInterface;

    OkHttpClient mOkHttpClient;
    String a,b,c,d,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            initializeRestAdapter();

            if (isOnline()){
                Toast.makeText(this, "Connected to internet", Toast.LENGTH_SHORT).show();
                myWebInterface.web_registerUser("2","222","2222","222","bnbnbnb","222",registrationCallback);
              // myWebInterface.callOTP("fff","fff","b",OTPResponseCallback);
            }else{
                Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
            }

        }       catch (Exception e){e.printStackTrace();}

    }

    public Boolean isOnline() {
        try {
            Process p1 = java.lang.Runtime.getRuntime().exec("ping -c 1 www.google.com");
            int returnVal = p1.waitFor();
            boolean reachable = (returnVal==0);
            return reachable;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void initializeRestAdapter()
    {
        try {
            mOkHttpClient = new OkHttpClient();
            mOkHttpClient.setConnectTimeout(30, TimeUnit.SECONDS);
            mOkHttpClient.setReadTimeout(30, TimeUnit.SECONDS);

            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setConverter(new GsonConverter(new Gson()))
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setEndpoint(Config.BASE_DOMAIN)
                    .setClient(new OkClient(mOkHttpClient))
                    .build();

            myWebInterface = restAdapter.create(My_Web_Interface.class);

        }       catch (Exception e){e.printStackTrace();}

    }
    Callback<RegistrationResponse> registrationCallback = new Callback<RegistrationResponse>() {
        @Override
        public void success(RegistrationResponse registrationResponse, Response response) {
            try {
                Log.e("testlog","success"+response.getBody().toString());

               // registrationResponse.getModel_inside().get(0).
             /*   Log.e("--->","value 11111"+registrationResponse.getValue1());
                Log.e("--->","value 22222"+registrationResponse.getValue2());*/


               /* for (int i=0;i<registrationResponse.getModel_inside().size();i++){
                    Log.e("--->",""+registrationResponse.getModel_inside().get(i).getfName());
                    Log.e("--->",""+registrationResponse.getModel_inside().get(i).getuId());
                }*/
            }
            catch (Exception e){e.printStackTrace();}
        }

        @Override
        public void failure(RetrofitError error) {
            Log.e("testlog","error.getBody()"+error.getBody());
            Log.e("testlog","error.getResponse()"+error.getResponse());
            Toast.makeText(MainActivity.this, "Network Error Occured... Try Again", Toast.LENGTH_LONG).show();

        }
    };





    Callback<OTPResponse> OTPResponseCallback = new Callback<OTPResponse>() {
        @Override
        public void success(OTPResponse registrationResponse, Response response) {
            try {
                Log.e("testlog","success"+response.getBody().toString());

             /*   Log.e("--->","value 11111"+registrationResponse.getValue1());
                Log.e("--->","value 22222"+registrationResponse.getValue2());*/


               /* for (int i=0;i<registrationResponse.getModel_inside().size();i++){
                    Log.e("--->",""+registrationResponse.getModel_inside().get(i).getfName());
                    Log.e("--->",""+registrationResponse.getModel_inside().get(i).getuId());
                }*/
            }
            catch (Exception e){e.printStackTrace();}
        }

        @Override
        public void failure(RetrofitError error) {
            Log.e("testlog","error.getBody()"+error.getBody());
            Log.e("testlog","error.getResponse()"+error.getResponse());
            Toast.makeText(MainActivity.this, "Network Error Occured... Try Again", Toast.LENGTH_LONG).show();

        }
    };

}
