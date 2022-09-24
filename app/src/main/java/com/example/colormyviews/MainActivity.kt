package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.colormyviews.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }
    private fun setListeners() {
        //Get a reference for each textview
        val boxOneText = findViewById<TextView>(id.box_one_text)
        val boxTwoText = findViewById<TextView>(id.box_two_text)
        val boxThreeText = findViewById<TextView>(id.box_three_text)
        val boxFourText = findViewById<TextView>(id.box_four_text)
        val boxFiveText = findViewById<TextView>(id.box_five_text)

        //Get a reference to Constraint Layout as dedfined in activity_main.xml
        val rootConstraintLayout = findViewById<View>(id.constraint_layout)

        //Gt a reference to the buttons
        val redButton = findViewById<Button>(id.red_button)
        val greenButton = findViewById<Button>(id.green_button)
        val yellowButton = findViewById<Button>(id.yellow_button)

        //MAke a  list of views
        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }

        }
    }
    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            // Boxes using custom colors for background
            id.red_button -> box_three_text.setBaackgroundResource(R.color.my_red)
            id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}