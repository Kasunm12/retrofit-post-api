package com.edulifesolutions.retrofitpostapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btnSendPostRequest;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendPostRequest = findViewById(R.id.btnSendPostRequest);

        btnSendPostRequest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                btnSendPostRequestClicked();
            }
        });
    }

    private void btnSendPostRequestClicked() {

        ApiInterface apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<User> call = apiInterface.getUserInformation("Kasun Weerasekara", "Software Engineer-Mobile Developer");

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                Log.e(TAG, "onResponse: " +response.code());
                Log.e(TAG, "onResponse: name :" +response.body().getName());
                Log.e(TAG, "onResponse: createAt :" +response.body().getCreatedAt());
                Log.e(TAG, "onResponse: job :" +response.body().getJob());
                Log.e(TAG, "onResponse: id :" +response.body().getId());

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

                Log.e(TAG, "onFailure: "+t.getMessage());
            }
        });

    }
}