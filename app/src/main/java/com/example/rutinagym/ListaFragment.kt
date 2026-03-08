package com.example.rutinagym

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ListaFragment : Fragment(R.layout.fragment_lista2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lista = view.findViewById<ListView>(R.id.listaEjercicios)

        val ejercicios = arrayOf(
            "Press inclinado con barra 4x8-10",
            "Pect fly 4x10-15",
            "Remo unilateral con polea 4x10-15",
            "Jalón al pecho 4x10-12",
            "Elevaciones laterales 4x20-25",
            "Press militar 4x8-10",
            "Extensión tríceps polea 4x10-15",
            "Rompe cráneos 4x10-15",
            "Curl martillo 3x12",
            "Curl bíceps 3x10-15"
        )

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            ejercicios
        )

        lista.adapter = adapter
    }
}