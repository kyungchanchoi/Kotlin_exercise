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
        mBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(mBinding.root);

        var button42 = mBinding.button42;

        // button id : button_4_2
        button42.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://naver.com"))
            startActivity(intent);
        }
    }
}