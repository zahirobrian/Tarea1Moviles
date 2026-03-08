package com.example.rutinagym

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class BotonesFragment : Fragment(R.layout.fragment_botones) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.btnRutinaLunes)
        val txtRutina = view.findViewById<TextView>(R.id.txtRutina)

        btn.setOnClickListener {

            txtRutina.text =
                "Rutina Lunes:\n\n" +
                        "Press inclinado con barra 4x8-10\n" +
                        "Pect fly 4x10-15\n" +
                        "Remo unilateral polea 4x10-15\n" +
                        "Jalón al pecho 4x10-12\n" +
                        "Elevaciones laterales 4x20-25\n" +
                        "Press militar 4x8-10\n" +
                        "Extensión tríceps polea 4x10-15\n" +
                        "Rompe cráneos 4x10-15\n" +
                        "Curl martillo 3x12\n" +
                        "Curl bíceps 3x10-15"

        }
    }
}