package com.example.kotlin_ex

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.kotlin_ex.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    // 뷰 바인딩
    private lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        //setContentView(R.layout.activity_main) 대신 뷰 바인딩 사용
        // ActivityMainBinding 으로 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // WebView를 가져옴
        var web : WebView = mBinding.web
        web.webViewClient = WebViewClient() // WebViewClient() 함수를 정의
        web.loadUrl("https://m.naver.com") // 앱 실행시 웹 뷰가 로딩 완료되면 해당 사이트로 이동
        web.settings.javaScriptEnabled = true // 웹뷰 안에서 javaScript 실행을 허용

        // 4개의 버튼을 가져옴
        var buttonBACK = mBinding.button1
        var buttonGO = mBinding.button2
        var buttonRELOAD = mBinding.button3
        var buttonHOME = mBinding.button4

        // BACK 버튼 클릭시
        buttonBACK.setOnClickListener {
            web.goBack() // 이전 페이지로 이동
        }

        // GO 버튼 클릭시
        buttonGO.setOnClickListener {
            web.goForward() // 다음 페이지로 이동
        }
        // RELOAD 버튼 클릭시
        buttonRELOAD.setOnClickListener {
            web.reload() // 새로고침
        }

        // HOME 버튼 클릭시
        buttonHOME.setOnClickListener {
            web.loadUrl("https://m.naver.com") // 해당 url(home)으로 이동
        }
    }
}