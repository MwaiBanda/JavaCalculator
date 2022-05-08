package com.mwaibanda.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = findViewById(R.id.number1);
        TextView text2 = findViewById(R.id.number2);
        TextView resultText = findViewById(R.id.resultView);

        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);



        btnPlus.setOnClickListener(view -> {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
               resultText.setText(String.format("%d", num1 + num2));
        });

        btnMinus.setOnClickListener(view -> {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            resultText.setText(String.format("%d", num1 - num2));
        });

        btnMultiply.setOnClickListener(view -> {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            resultText.setText(String.format("%d", num1 * num2));
        });

        btnDivide.setOnClickListener(view -> {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            resultText.setText(String.format("%d", num1 / num2));
        });
    }
}