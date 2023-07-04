package com.example.Calculadora

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  Conectamos el .xml al .java  */
        val Num1 = findViewById<TextView>(R.id.num1)
        val Num2 = findViewById<TextView>(R.id.num2)
        val Result = findViewById<TextView>(R.id.result)
        val Suma = findViewById<Button>(R.id.button1)
        val Resta = findViewById<Button>(R.id.button2)
        val Division = findViewById<Button>(R.id.button3)
        val Multiplicacion = findViewById<Button>(R.id.button4)

        /* Process */
        Suma.setOnClickListener {
            val num1 = Num1.text.toString()
            val num2 = Num2.text.toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Empty()
            } else {
                try {
                    val result = num1.toInt() + num2.toInt()
                    val Respuesta = getString(R.string.respuesta)
                    Result.text = Respuesta + result
                    Num1.text = ""
                    Num2.text = ""
                } catch (e: NumberFormatException) {
                    error()
                }
            }
        }
        Resta.setOnClickListener {
            val num1 = Num1.text.toString()
            val num2 = Num2.text.toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Empty()
            } else {
                try {
                    val result = num1.toInt() - num2.toInt()
                    val Respuesta = getString(R.string.respuesta)
                    Result.text = Respuesta + result
                    Num1.text = ""
                    Num2.text = ""
                } catch (e: NumberFormatException) {
                    error()
                }
            }
        }
        Division.setOnClickListener {
            val num1 = Num1.text.toString()
            val num2 = Num2.text.toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Empty()
            } else {
                try {
                    val result = num1.toInt() / num2.toInt()
                    val Respuesta = getString(R.string.respuesta)
                    Result.text = Respuesta + result
                    Num1.text = ""
                    Num2.text = ""
                } catch (e: NumberFormatException) {
                    error()
                }
            }
        }
        Multiplicacion.setOnClickListener {
            val num1 = Num1.text.toString()
            val num2 = Num2.text.toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Empty()
            } else {
                try {
                    val result = num1.toInt() * num2.toInt()
                    val Respuesta = getString(R.string.respuesta)
                    Result.text = Respuesta + result
                    Num1.text = ""
                    Num2.text = ""
                } catch (e: NumberFormatException) {
                    error()
                }
            }
        }
        val btnsalir = findViewById<Button>(R.id.button5)
        btnsalir.setOnClickListener { finish() }
    }

    fun Empty() {
        val toast1 = getString(R.string.toast1)
        val tostada = Toast.makeText(applicationContext, toast1, Toast.LENGTH_LONG)
        tostada.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
        tostada.show()
    }
    fun error(){
        val Error = getString(R.string.Error)
        Toast.makeText(applicationContext, Error, Toast.LENGTH_LONG).show()
    }
}