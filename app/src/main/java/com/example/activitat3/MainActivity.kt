package com.example.activitat3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val BotonLogcat = findViewById<Button>(R.id.buttonLogCat);
        val BotonToast = findViewById<Button>(R.id.buttonToast);

        BotonLogcat.setOnClickListener{
            Log.d("MainActivity","Hola por consola");
        }
        BotonToast.setOnClickListener{
            Toast.makeText(this,"Hola por tostada con mantequilla", Toast.LENGTH_SHORT).show()
        }

    }
}