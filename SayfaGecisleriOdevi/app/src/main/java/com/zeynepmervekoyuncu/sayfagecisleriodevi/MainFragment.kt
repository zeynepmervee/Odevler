package com.zeynepmervekoyuncu.sayfagecisleriodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val buttonBirinci = view.findViewById<Button>(R.id.buttonBirinci)
        val buttonUcuncu = view.findViewById<Button>(R.id.buttonUcuncu)

        buttonBirinci.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_birinciFragment)
        }

        buttonUcuncu.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_ucuncuFragment)
        }

        return view
    }
}

