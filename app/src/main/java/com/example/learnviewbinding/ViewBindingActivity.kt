package com.example.learnviewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnviewbinding.databinding.SampleActivityBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: SampleActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SampleActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setDataOnViews()
        applyListener()
    }

    private fun applyListener() {
        binding.buttonMoveToNextScreen.setOnClickListener {
            val intent = Intent(this, ActivityWithoutViewBinding::class.java)
            startActivity(intent)
        }
    }

    private fun setDataOnViews() {
        binding.tvHello.text = "Hello!"
        binding.tvViewBinding.text = "View Binding"
    }
}