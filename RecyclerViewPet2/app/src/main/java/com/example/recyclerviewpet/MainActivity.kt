package com.example.recyclerviewpet

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.* // 이부분 중요
import kotlinx.android.synthetic.main.activity_main.rv_data_list
import kotlinx.android.synthetic.main.data_list_item.*
import java.security.AccessControlContext
import com.example.recyclerviewpet.DataAdapter


class MainActivity : AppCompatActivity() {
    val dataArray = ArrayList<String>() // 1. 빈 배열 목록 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addDataArray() // 2. 배열 내용 로드

        //각 아이템을 배치하고 아이템이 더 이상 보이지않을 때 재사용 할것인지 결정적인 역할을 함
        rv_data_list.layoutManager = LinearLayoutManager(this) // 4. 레이아웃 매니저를 생성

        //5. RecyclerView 어탭터에 접근해 데이터를 로드

        rv_data_list.adapter = DataAdapter(items = dataArray, context = this)
    }


    // 3. 배열을 채우는 함수
    fun addDataArray(){ //나중에 DB나 네트워크를 활용해보자
        dataArray.add("1")
        dataArray.add("2")
        dataArray.add("3")
        dataArray.add("4")
        dataArray.add("5")
        dataArray.add("6")
        dataArray.add("7")
        dataArray.add("8")
        dataArray.add("9")
        dataArray.add("10")
    }

}
