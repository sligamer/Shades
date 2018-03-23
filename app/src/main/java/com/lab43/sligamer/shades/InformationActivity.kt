package com.lab43.sligamer.shades

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by Justin Freres on 3/10/2018.
 * Class for Information Activity
 * Lab 4-3 Shades Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class InformationActivity : AppCompatActivity() {

    private lateinit var infotxtview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TASK 1: VERIFY THE ORIENTATION HAS BEEN SWITCHED TO LANDSCAPE
        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish()
            return
        }

        // TASK 2: SET THE LAYOUT FOR THIS ACTIVITY
        setContentView(R.layout.information_fragment)

        // TASK 3: DISPLAY THE UP ICON IN THE ACTION BAR
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        //actionBar.setDisplayHomeAsUpEnabled(true)

        // TASK 4: RETURN THE INTENT THAT STARTED THIS ACTIVITY
        var activityIntent = intent
        val shadeInformation = activityIntent.getStringExtra("Information")

        // TASK 5:  SET THE INFORMATION TEXT
        infotxtview = findViewById(R.id.infotextView)
        infotxtview.text = shadeInformation
    }
}