package com.example.kotlin_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_ex.databinding.ActivityPage1Binding

class page1 : AppCompatActivity() {

    private lateinit var p1Binding: ActivityPage1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        p1Binding = ActivityPage1Binding.inflate(layoutInflater)
        setContentView(p1Binding.root)

        var buttonp1 = p1Binding.buttonPage1

        buttonp1.setOnClickListener {
            var intentgomain = Intent(this, MainActivity::class.java)
            startActivity(intentgomain)
        }
    }
}