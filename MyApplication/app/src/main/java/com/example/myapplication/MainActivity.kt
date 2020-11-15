package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleOn() //확장함수 호출

        /*val tvTitle = findViewById<TextView>(R.id.tv_title)
        tvTitle.text = "안드로이드 스튜디오 오랜만이네"*/

        // import kotlinx.android.synthetic.main.activity_main.* 이코드를 통해 레이아웃 리소스의 id값에 직접 접근이 가능한것
        // 코틀린의 확장기능을 사용해 합성 프로퍼티를 사용하면 더 쉽게 코드를 짤수 있음
        //확장 기능을 통해 tv_title를 객체 처럼 사용가능
        tv_title1.text = "안드로이드 스튜디오 오랜만?"


    }

    // 확장함수 형태로 사용
    // onCreate()에서 titleOn이 호출될 때 캐시된 정보를 읽기 때문 빠르게 처리된다고함
    fun MainActivity.titleOn() {
        tv_title2.text = "확장함수 형태로 접근"
        tv_title2.visibility = View.VISIBLE
    }
}
