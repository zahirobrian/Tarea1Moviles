package com.example.rutinagym

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class TextFieldsFragment : Fragment(R.layout.fragment_text_fields) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val editReps = view.findViewById<EditText>(R.id.editReps)
        val btnGuardar = view.findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {

            val texto = editReps.text.toString()

            Toast.makeText(
                requireContext(),
                "Repeticiones guardadas: $texto",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}