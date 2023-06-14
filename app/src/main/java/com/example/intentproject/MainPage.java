package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    TextView txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        txtcorreo = findViewById(R.id.txtcorreo);
        Intent intent = getIntent();

        String correo= intent.getStringExtra("keyword");
    }
}