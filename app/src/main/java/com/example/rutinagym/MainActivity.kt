package com.example.rutinagym

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedorFragments, TextFieldsFragment())
            .commit()

        findViewById<Button>(R.id.btnText).setOnClickListener {
            cambiarFragment(TextFieldsFragment())
        }

        findViewById<Button>(R.id.btnBotones).setOnClickListener {
            cambiarFragment(BotonesFragment())
        }

        findViewById<Button>(R.id.btnSeleccion).setOnClickListener {
            cambiarFragment(SeleccionFragment())
        }

        findViewById<Button>(R.id.btnLista).setOnClickListener {
            cambiarFragment(ListaFragment())
        }

        findViewById<Button>(R.id.btnInfo).setOnClickListener {
            cambiarFragment(InfoFragment())
        }
    }

    private fun cambiarFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedorFragments, fragment)
            .commit()

    }
}