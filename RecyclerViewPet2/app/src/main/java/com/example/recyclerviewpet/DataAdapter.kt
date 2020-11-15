package com.example.recyclerviewpet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.data_list_item.view.*


class DataAdapter( // 1.
    val items : ArrayList<String>,
    val context: Context
) : RecyclerView.Adapter<ViewHolder>( ) {

    // 2.
    override fun getItemCount(): Int {
        return items.size
    }
    // 3.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder (LayoutInflater.from(context).inflate(
              R.layout.data_list_item,
            parent,
            false
            ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvDataType.text = items[position]
    }

}

class ViewHolder (view: View): RecyclerView.ViewHolder(view){
    //TextView에 각 데이터 항목을 가져오기 위해 리소르로부터
    val tvDataType = view.rv_data_type!! // 6.안드로이드 확장을 통해 리소스 id 사용
}
