package com.lab43.sligamer.shades

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Justin Freres on 3/10/2018.
 * Class for Main Activity
 * Lab 4-3 Shades Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class MainActivity : AppCompatActivity(), ListFragment.OnItemSelectedListener {

    private lateinit var informationFragmentClass: InformationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onShadeItemSelected(link: String) {

        // TASK 1: CHECK IF THE INFORMATION FRAGMENT EXIST IN THIS LAYOUT
        informationFragmentClass = InformationFragment()

        var informationFragment = fragmentManager.findFragmentById(R.id.fragmentListHorizontal)

        // TASK 2: CHECK IF A TWO PANE CONFIGURATION BEING DISPLAYED?
        if(informationFragment != null && informationFragment.isInLayout)
        {
            informationFragmentClass.setText(link)
        }else {

            // A SINGLE PANE CONFIGURATION EXIST
            // PASS DATA
            val informationIntent = Intent(this, InformationActivity::class.java)
            informationIntent.putExtra("Information", link)
            startActivity(informationIntent)
        }

    }

}
