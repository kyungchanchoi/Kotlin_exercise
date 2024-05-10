package com.example.kotlin_ex

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        var button41 = mBinding.button41;

        // button id : button_4_1
        button41.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "님들 토스토 보임?",
                Toast.LENGTH_LONG).show();
        }
    }
}