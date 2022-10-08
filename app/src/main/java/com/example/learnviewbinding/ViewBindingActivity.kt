package com.example.learnviewbinding

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
    }

    private fun setDataOnViews() {
        binding.tvHello.text = "Hello!"
        binding.tvViewBinding.text = "View Binding"
    }
}