/*
package com.example.user.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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

public class Main2Activity extends AppCompatActivity {
    My_Web_Interface myWebInterface;

    OkHttpClient mOkHttpClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try {
            initializeRestAdapter();

            myWebInterface.callOTP( registrationCallback);
        }       catch (Exception e){e.printStackTrace();}

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
                Log.e("testlog",""+response.getBody().toString());

                Log.e("--->","value 11111"+registrationResponse.getValue1());
                Log.e("--->","value 22222"+registrationResponse.getValue2());
                Log.e("--->","value 22222"+registrationResponse.getValue3());
                Log.e("--->","value 22222"+registrationResponse.getValue4());


               */
/* for (int i=0;i<registrationResponse.getModel_inside().size();i++){
                    Log.e("--->",""+registrationResponse.getModel_inside().get(i).getfName());
                    Log.e("--->",""+registrationResponse.getModel_inside().get(i).getuId());
                }*//*

            }
            catch (Exception e){e.printStackTrace();}
        }

        @Override
        public void failure(RetrofitError error) {
            Toast.makeText(Main2Activity.this, "Network Error Occured... Try Again", Toast.LENGTH_LONG).show();

        }
    };
}
*/
