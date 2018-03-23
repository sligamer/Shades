package com.lab43.sligamer.shades

import android.app.Activity
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * Created by Justin Freres on 3/10/2018.
 * Class for List Fragment
 * Lab 4-3 Shades Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class ListFragment : Fragment() {


    private lateinit var listener: OnItemSelectedListener
    private lateinit var information: String
    private lateinit var viewReturn: View

    private lateinit var btnPlum: Button
    private lateinit var btnBlue: Button
    private lateinit var btnGold: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        viewReturn = inflater.inflate(
                R.layout.list_fragment,
                container,
                false
        )

        btnPlum = viewReturn.findViewById(R.id.btnPlum)
        btnPlum.setOnClickListener { v -> setShadeDescription(v) }

        btnBlue = viewReturn.findViewById(R.id.btnBlue)
        btnBlue.setOnClickListener { v -> setShadeDescription(v) }

        btnGold = viewReturn.findViewById(R.id.btnGold)
        btnGold.setOnClickListener { v -> setShadeDescription(v) }

        return viewReturn
    }

    fun setShadeDescription(v: View)
    {
        var description = v!!.contentDescription
        information = description as String
        updateDetail()
    }


    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        if(activity is OnItemSelectedListener )
        {
            listener = activity
        }
        else{
            throw ClassCastException(activity.toString() + " must implement ListFragment.OnItemSelectedListener")
        }
    }

    private fun updateDetail() {
       listener.onShadeItemSelected(information)
    }

    interface OnItemSelectedListener {
        fun onShadeItemSelected(link: String)
    }

}