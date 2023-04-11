package com.example.componentes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController


class FragmentPantalla3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View{
        val view = inflater.inflate(R.layout.fragment_pantalla3,container,false)
        val btnIrPantalla1 = view.findViewById<View>(R.id.btnIrPantalla1)
        btnIrPantalla1.setOnClickListener {
            findNavController().navigate(R.id.action_FragmentPantalla3_to_FragmentPantalla1)
        }
        return view
    }

}