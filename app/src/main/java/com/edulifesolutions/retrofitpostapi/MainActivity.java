package com.edulifesolutions.retrofitpostapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Send_Post_Request_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Send_Post_Request_Button = findViewById(R.id.Send_Post_Request_Button);

        Send_Post_Request_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
    }

    private void Send_Post_Request_Button() {

    }
}