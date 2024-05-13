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
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.kotlin_ex.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    // 뷰 바인딩
    private lateinit var mBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        //setContentView(R.layout.activity_main) 대신 뷰 바인딩 사용
        // ActivityMainBinding 으로 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val builder = AlertDialog.Builder(this) // AlertDialog.Builder 객체 생성
        builder.setTitle("경고창 이름") // 경고창의 이름
            .setMessage("경고창 메세지")  // 경고창의 메시지
            .setPositiveButton("확인", // 확인 버튼 생성
            DialogInterface.OnClickListener { dialogInterface, id ->
                // '확인' 버튼 클릭시 실행되는 기능
                Toast.makeText(this,"확인 버튼을 눌렀습니다!",Toast.LENGTH_SHORT).show()
            })
            .setNegativeButton("취소", // 취소 버튼 생성
            DialogInterface.OnClickListener { dialogInterface, id ->
                // '취소' 버튼 클릭시 실행되는 기능
                var intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://m.naver.com"))
                startActivity(intent)
            })
        
        builder.show() // builder 표시
    }
}