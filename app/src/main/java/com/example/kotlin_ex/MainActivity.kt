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
    private lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // ActivityMainBinding 으로 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        var leftmovebutton = mBinding.button // 버튼이 왼쪽으로 이동
        var bigbutton = mBinding.button2 // 누른 버튼이 커짐

        leftmovebutton.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.act1)
            leftmovebutton.startAnimation(anim)
        }

        bigbutton.setOnClickListener {
            val anim2 = AnimationUtils.loadAnimation(this, R.anim.act2)
            bigbutton.startAnimation(anim2)
        }

    }
}