package com.example.kotlin_ex

import android.app.Activity
import android.content.Intent
import android.health.connect.datatypes.units.Length
import android.media.MediaPlayer
import android.media.SoundPool
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.kotlin_ex.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    // 뷰 바인딩
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        //setContentView(R.layout.activity_main) 대신 뷰 바인딩 사용
        // ActivityMainBinding 으로 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        var Button1 = mBinding.imageButton
        var Button2 = mBinding.imageButton2
        var Button3 = mBinding.imageButton3

        // 버튼1 클릭시 토스트메시지 출력
        Button1.setOnClickListener{
            Toast.makeText(
                this,"버튼1 Activate!", Toast.LENGTH_LONG).show()
        }

        // 버튼2 클릭시 토스트메시지 출력
        Button2.setOnClickListener{
            Toast.makeText(
                this,"버튼2 Activate!", Toast.LENGTH_LONG).show()
        }

        // 버튼3 클릭시 토스트메시지 출력
        Button3.setOnClickListener{
            Toast.makeText(
                this,"버튼3 Activate!", Toast.LENGTH_LONG).show()
        }
    }
}