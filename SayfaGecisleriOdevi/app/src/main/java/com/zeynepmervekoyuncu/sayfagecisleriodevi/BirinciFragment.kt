package com.zeynepmervekoyuncu.sayfagecisleriodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BirinciFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_birinci, container, false)

        val button = view.findViewById<Button>(R.id.buttonToSecond)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_birinciFragment_to_ikinciFragment)
        }

        return view
    }
}
