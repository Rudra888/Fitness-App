package com.example.rudra888.fitness


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class TryAgainFragment : Fragment() {

    lateinit var tryAgainButton : Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.try_again, container, false)


        tryAgainButton = v.findViewById(R.id.try_again_button)

        tryAgainButton.setOnClickListener(

            Navigation.createNavigateOnClickListener(R.id.action_tryAgainFragment_to_exerciseFragment)
        )


        return v
    }


}
