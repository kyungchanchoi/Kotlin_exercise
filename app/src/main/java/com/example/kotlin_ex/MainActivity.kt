package com.example.kotlin_ex

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.health.connect.datatypes.units.Length
import android.media.MediaPlayer
import android.media.SoundPool
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
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
        //setContentView(R.layout.activity_main)

        // ActivityMainBinding 으로 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // 웹 뷰 - 시작 페이지는 구글
        var web = mBinding.WebView
        web.webViewClient = WebViewClient()
        web.loadUrl("https://www.google.com/")
        web.settings.javaScriptEnabled = true // 자바스크립트 허용

        // 교통정보 버튼
        var GYO = mBinding.button
        GYO.setOnClickListener {
            web.loadUrl("https://topis.seoul.go.kr/") // 서울 교통 정보 사이트
        }
        
        // 취업 버튼
        var CHUI = mBinding.button2
        CHUI.setOnClickListener {
            web.loadUrl("https://m.work.go.kr/main.do") // 노동부 취업 사이트 워크넷 모바일 사이트
        }
        
        // 날씨 버튼
        var NAL = mBinding.button3
        NAL.setOnClickListener {
            web.loadUrl("https://www.weather.go.kr/w/index.do") // 기상청 사이트
        }
        
        // 지도 버튼
        var ZIDO = mBinding.button4
        ZIDO.setOnClickListener {
            web.loadUrl("https://www.google.co.kr/maps/") // 구글 지도 사이트
        }

        // BACK 버튼
        var BACKBUTTON = mBinding.button5
        BACKBUTTON.setOnClickListener {
            web.goBack()
        }

        // RELOAD 버튼
        var RELOADBUTTON = mBinding.button6
        RELOADBUTTON.setOnClickListener {
            web.reload()
        }

        // GO 버튼
        var GOBUTTON = mBinding.button7
        GOBUTTON.setOnClickListener {
            web.goForward()
        }
    }
}