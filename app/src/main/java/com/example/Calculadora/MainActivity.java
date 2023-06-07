package com.example.Calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
            if (num1.isEmpty() || num2.isEmpty() ){
                String toast1 = getString(R.string.toast1);
                Toast tostada= Toast.makeText(getApplicationContext(),toast1,Toast.LENGTH_LONG);
                tostada.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                tostada.show();
            } else {
                try {

                    int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    String Respuesta = getString(R.string.respuesta);
                    Result.setText(Respuesta + result);
                    Num1.setText("");
                    Num2.setText("");
                } catch (NumberFormatException e) {

                    String Error = getString(R.string.Error);
                    Toast.makeText(getApplicationContext(), Error, Toast.LENGTH_LONG).show();

                }
            }
        }

    });
    Resta.setOnClickListener(new View.OnClickListener() {

        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {

            String num1 = Num1.getText().toString();
            String num2 = Num2.getText().toString();
            if (num1.isEmpty() || num2.isEmpty() ){
                String toast1 = getString(R.string.toast1);
                Toast tostada= Toast.makeText(getApplicationContext(),toast1,Toast.LENGTH_LONG);
                tostada.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                tostada.show();
            } else {
                try {

                    int result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    String Respuesta = getString(R.string.respuesta);
                    Result.setText(Respuesta + result);
                    Num1.setText("");
                    Num2.setText("");
                } catch (NumberFormatException e) {

                    String Error = getString(R.string.Error);
                    Toast.makeText(getApplicationContext(), Error, Toast.LENGTH_LONG).show();

                }
            }
        }

    });
    Division.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() ){
                    String toast1 = getString(R.string.toast1);
                    Toast tostada= Toast.makeText(getApplicationContext(),toast1,Toast.LENGTH_LONG);
                    tostada.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    tostada.show();
                } else {
                    try {
                        int result = Integer.parseInt(num1) / Integer.parseInt(num2);
                        String Respuesta = getString(R.string.respuesta);
                        Result.setText(Respuesta + result);
                        Num1.setText("");
                        Num2.setText("");
                    } catch (NumberFormatException e) {

                        String Error = getString(R.string.Error);
                        Toast.makeText(getApplicationContext(), Error, Toast.LENGTH_LONG).show();

                    }
                }
            }

        });
    Multiplicacion.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
{
                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() ){
                    String toast1 = getString(R.string.toast1);
                    Toast tostada= Toast.makeText(getApplicationContext(),toast1,Toast.LENGTH_LONG);
                    tostada.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    tostada.show();
                } else {
                    try {
                        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
                        String Respuesta = getString(R.string.respuesta);
                        Result.setText(Respuesta + result);
                        Num1.setText("");
                        Num2.setText("");
                    } catch (NumberFormatException e) {
                        String Error = getString(R.string.Error);
                        Toast.makeText(getApplicationContext(), Error, Toast.LENGTH_LONG).show();
                    }
                }
            }

        });


        Button btnsalir = findViewById(R.id.button5);
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}