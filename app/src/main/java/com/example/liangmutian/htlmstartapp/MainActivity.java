package com.example.liangmutian.htlmstartapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent != null) {

            String data = intent.getDataString();

            if (data != null) {
                Toast.makeText(this, data, Toast.LENGTH_LONG).show();
            }
        }


    }
}
