package com.example.uipaypal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setImageResource(R.drawable.custom_floating_button_1)
        btnNext.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }
        bottomNavMenu.background = null
        bottomNavMenu.menu.getItem(1).isEnabled = false
    }
}