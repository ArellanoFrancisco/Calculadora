package com.example.Calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  Conectamos el .xml al .java  */
        TextView Num1 = findViewById(R.id.num1);
        TextView Num2 = findViewById(R.id.num2);
        TextView Result = findViewById(R.id.result);
        Button Suma = findViewById(R.id.button1);
        Button Resta = findViewById(R.id.button2);
        Button Division= findViewById(R.id.button3);
        Button Multiplicacion = findViewById(R.id.button4);

        /* Process */

    Suma.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {

            String num1 = Num1.getText().toString();
            String num2 = Num2.getText().toString();

            int result = Integer.parseInt(num1)+Integer.parseInt(num2);
            Result.setText("El Resultado es "+result);
            Num1.setText("");
            Num2.setText("");

        }

    });
    Resta.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {

             String num1 = Num1.getText().toString();
             String num2 = Num2.getText().toString();

             int result = Integer.parseInt(num1)-Integer.parseInt(num2);
             Result.setText("El Resultado es "+result);
             Num1.setText("");
             Num2.setText("");

        }

    });
    Division.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();

                int result = Integer.parseInt(num1)/Integer.parseInt(num2);
                Result.setText("El Resultado es "+result);
                Num1.setText("");
                Num2.setText("");

            }

        });
    Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();

                int result = Integer.parseInt(num1)*Integer.parseInt(num2);
                Result.setText("El Resultado es "+result);
                Num1.setText("");
                Num2.setText("");

            }

        });


    }
}