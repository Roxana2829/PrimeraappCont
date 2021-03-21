package com.example.primero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    //Declaracion de las variables
    lateinit var quintoBoton: Button
    lateinit var sextoBoton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Inicializar las variables
        quintoBoton = findViewById(R.id.boton_cinco)
        sextoBoton = findViewById(R.id.boton_seis)

        quintoBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,MainActivity::class.java)
            startActivity(miInten)
        })

        sextoBoton.setOnClickListener(View.OnClickListener {
                val miInten = Intent(this,MainActivity4::class.java)
                startActivity(miInten)
            })
        }


    override fun onStart() {
        super.onStart()
        Log.i("mi_app","Estoy en el metodo onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app","Estoy en el metodo onPause")
    }
}