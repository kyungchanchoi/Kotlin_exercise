package com.example.kotlin_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_ex.databinding.ActivityPage1Binding
import com.example.kotlin_ex.databinding.ActivityPage2Binding

class page2 : AppCompatActivity() {

    private lateinit var p2Binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        p2Binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(p2Binding.root)

        var buttonp2 = p2Binding.buttonPage2

        buttonp2.setOnClickListener {
            var intentgomain = Intent(this, MainActivity::class.java)
            startActivity(intentgomain)
        }
    }
}