package com.example.kotlin_ex

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.media.SoundPool
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
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

        var Playshort = mBinding.buttonshort
        var Playlong = mBinding.buttonlong

        val mPlay1 = SoundPool.Builder().build() // SoundPool의 객체 mPlay1 생성
        val SD = mPlay1.load(this, R.raw.musicshort, 1) // 해당 음원을 실행
        
        Playshort.setOnClickListener {
            mPlay1.play(SD, 1.0f, 1.0f, 0, 0, 1.0f)
        }

        val mPlay2 = MediaPlayer.create(this, R.raw.musiclong) // MediaPlayer 객체 생성

        Playlong.setOnClickListener {
            mPlay2.start()

            // 시스템 리소스 해제
            //mPlay2.release()
        }
    }
}