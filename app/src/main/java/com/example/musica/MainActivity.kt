package com.example.musica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
 private lateinit var etCorreo : EditText
 private lateinit var etPass :  EditText
 private lateinit var btnInicio :  Button
 private lateinit var dbHelper :  DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvcrearcuenta = findViewById<TextView>(R.id.tvcrearcuenta)


        etCorreo = findViewById(R.id.etcorreo)
        etPass = findViewById(R.id.etpassword)
        btnInicio = findViewById(R.id.btnregistrar)

        dbHelper = DatabaseHelper(this)

        //EVENTO PARA INCIAR SESION
        btnInicio.setOnClickListener {
            //TODO: Agregar método de inicio de sesión
        }

        tvcrearcuenta.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }




        }
    }
