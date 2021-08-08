package com.example.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    lateinit var tvUsername: AppCompatTextView
    lateinit var tvEmail: AppCompatTextView

    //lateinit var tvEmail: Button // No type safe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvUsername = findViewById(R.id.tvUsername)
        tvEmail = findViewById(R.id.tvEmail)

        // tvEmail = findViewById(R.id.tvSample) // No Null Safe

        tvUsername.text = "Username : Milan"
        tvEmail.text = "Email : milan.vadhel@mindinventroy.com"
    }
}