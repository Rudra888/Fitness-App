package com.example.rudra888.fitness


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class WellDoneFragment : Fragment() {

    lateinit var wellDoneButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.well_done, container, false)

        wellDoneButton = v.findViewById(R.id.next_workout_button)

        wellDoneButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_wellDoneFragment_to_exerciseFragment)
        )

        return v
    }


}
