package com.example.primero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    //Declaracion de las variables
    var contador = 0
    lateinit var btnincrementar:Button
    lateinit var btndecrementar:Button
    lateinit var tvContador:TextView
    lateinit var tercerBoton: Button
    lateinit var cuartoBoton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        Log.i("mi_app","Estoy en el metodo onCreate")

        //Inicializar las variables
        btnincrementar = findViewById(R.id.btnIncrementar)
        btndecrementar = findViewById(R.id.btnDecrementar)
        tvContador = findViewById(R.id.tvNumero)
        tercerBoton = findViewById(R.id.boton_tres)
        cuartoBoton = findViewById(R.id.boton_cuatro)


        btnincrementar.setOnClickListener {
            contador++
            tvContador.text = "$contador"
            if (!btndecrementar.isEnabled){
                btndecrementar.isEnabled = true
            }
            Log.d("contador","$contador")
        }

        btndecrementar.setOnClickListener {
            if (contador < 1) {
                btndecrementar.isEnabled = false
            } else {
                contador--
            }
            tvContador.text = "$contador"

        }

        tercerBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,MainActivity::class.java)
            startActivity(miInten)
        })

        cuartoBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,MainActivity3::class.java)
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