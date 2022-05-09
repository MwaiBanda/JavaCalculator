package com.mwaibanda.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            if (!text1.getText().toString().isEmpty() && !text2.getText().toString().isEmpty()){
                   int num1 = Integer.parseInt(text1.getText().toString());
                   int num2 = Integer.parseInt(text2.getText().toString());
                   String result = String.format("%d", num1 + num2);
                   resultText.setText(result);
                   Intent intent = new Intent(this, ResultActivity.class);
                   intent.putExtra("result", result);
                   startActivity(intent);
               }

        });

        btnMinus.setOnClickListener(view -> {
            if (!text1.getText().toString().isEmpty() && !text2.getText().toString().isEmpty()) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());
                String result = String.format("%d", num1 - num2);
                resultText.setText(result);
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);

            }
        });

        btnMultiply.setOnClickListener(view -> {
            if (!text1.getText().toString().isEmpty() && !text2.getText().toString().isEmpty()) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());
                String result = String.format("%d", num1 * num2);
                resultText.setText(result);
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        btnDivide.setOnClickListener(view -> {
            if (!text1.getText().toString().isEmpty() && !text2.getText().toString().isEmpty()) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());
                String result = String.format("%d", num1 / num2);
                resultText.setText(result);
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}