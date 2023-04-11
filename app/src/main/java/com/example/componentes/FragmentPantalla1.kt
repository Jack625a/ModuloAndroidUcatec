package com.example.componentes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController


class FragmentPantalla1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View{
        val view = inflater.inflate(R.layout.fragment_pantalla1,container,false)
        val btnIrPantalla2 = view.findViewById<View>(R.id.btnIrPantalla2)
        btnIrPantalla2.setOnClickListener {
            findNavController().navigate(R.id.action_FragmentPantalla1_to_FragmentPantalla2)
        }
        return view
    }

}



