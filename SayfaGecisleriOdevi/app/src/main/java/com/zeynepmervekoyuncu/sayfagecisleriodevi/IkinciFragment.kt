package com.zeynepmervekoyuncu.sayfagecisleriodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class IkinciFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ikinci, container, false)

        val button = view.findViewById<Button>(R.id.buttonToFourth)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_ikinciFragment_to_dorduncuFragment)
        }

        return view
    }
}
