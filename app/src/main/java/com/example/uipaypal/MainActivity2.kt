package com.example.uipaypal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnNext.setOnClickListener {
            Intent(this,MainActivity3::class.java).also {
                startActivity(it)
            }
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}