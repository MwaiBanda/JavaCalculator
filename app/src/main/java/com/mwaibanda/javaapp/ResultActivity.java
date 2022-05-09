package com.mwaibanda.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView resultText = findViewById(R.id.resultText);
        String result = getIntent().getStringExtra("result");
        resultText.setText(String.format("%s%s", resultText.getText(), result));
    }
}