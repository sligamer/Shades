package com.lab43.sligamer.shades

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * Created by Justin Freres on 3/10/2018.
 * Class for Information Fragment
 * Lab 4-3 Shades Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class InformationFragment : Fragment() {

    private lateinit var viewReturn: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        viewReturn = inflater.inflate(
                R.layout.information_fragment,
                container,
                false
        )

        Companion.viewInfoReturn = viewReturn.findViewById(R.id.infotextView)

        return viewReturn

    }

    fun setText(shadeInfo: String)
    {
        Companion.viewInfoReturn.text = shadeInfo
    }

    companion object {
        lateinit var viewInfoReturn: TextView
    }
}