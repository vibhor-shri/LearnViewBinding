package com.example.learnviewbinding

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityWithoutViewBinding : AppCompatActivity() {

    private lateinit var buttonPressMe: Button
    private lateinit var textHello: TextView
    private lateinit var textActivityWithoutViewBinding: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_activity_without_view_binding)
        initializeViews()
        applyClickListener()
    }

    private fun initializeViews() {
        buttonPressMe = findViewById(R.id.button_press_me)
        textHello = findViewById(R.id.tv_hello_activity_without_view_binding)
        textActivityWithoutViewBinding = findViewById(R.id.tv_view_binding_not_applicable)
    }

    private fun applyClickListener() {
        buttonPressMe.setOnClickListener {
            textHello.text = resources.getString(R.string.hello)
            textActivityWithoutViewBinding.text =
                resources.getString(R.string.welcome_to_activity_without_view_binding)
        }
    }


}
