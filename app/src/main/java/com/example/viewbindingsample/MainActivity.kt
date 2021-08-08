package com.example.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.user = User(username = "Milan Kumar", email = "milan.vadhel@mindinventriy.com")
    }
}