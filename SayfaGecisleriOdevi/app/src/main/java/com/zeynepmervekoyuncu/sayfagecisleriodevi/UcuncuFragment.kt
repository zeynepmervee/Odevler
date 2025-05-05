package com.zeynepmervekoyuncu.sayfagecisleriodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class UcuncuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ucuncu, container, false)

        val button = view.findViewById<Button>(R.id.buttonToFourthFromThird)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_ucuncuFragment_to_dorduncuFragment)
        }

        return view
    }
}
