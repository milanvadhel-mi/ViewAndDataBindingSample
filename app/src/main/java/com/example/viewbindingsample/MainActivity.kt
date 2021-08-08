package com.example.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingsample.databinding.ActivityMainBinding

/**
 * Type safe
 * Null safe
 * */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            tvUsername.text = "Username : Milan Vadhel"
            tvEmail.text = "milan.vadhel@mindinventroy.com"
            //tvSample.text = "Hello World" // Null Safe
        }
    }
}