package com.example.kotlin_ex

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 뷰 바인딩
    private lateinit var mBinding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        //setContentView(R.layout.activity_main) 대신 뷰 바인딩 사용
        // ActivityMainBinding 으로 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        var button1 = mBinding.button431 // page1 이동 버튼
        var button2 = mBinding.button432 // page2 이동 버튼

        // button id : button_4_3_1
        button1.setOnClickListener {
            var intent1 = Intent(this, page1::class.java)
            startActivity(intent1)
        }
        // button id : button_4_3_2
        button2.setOnClickListener {
            var intent2 = Intent(this, page2::class.java)
            startActivity(intent2)
        }
    }
}