package com.example.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbindingsample.databinding.ActivityExampleBinding

class ExampleActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            btnBottomSheet.setOnClickListener(this@ExampleActivity)
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnBottomSheet -> {
                openBottomSheet()
            }
        }
    }

    private fun openBottomSheet() {

    }


}