package com.example.learnviewbinding

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.learnviewbinding.databinding.SampleFragmentActivityBinding

class SampleFragmentActivity : FragmentActivity() {

    private lateinit var binding: SampleFragmentActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SampleFragmentActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                add(binding.fragmentContainerViewOne.id, FragmentOne()).commit()
            }
            supportFragmentManager.beginTransaction().apply {
                add(binding.fragmentContainerViewTwo.id, FragmentTwo()).commit()
            }
        }
    }
}