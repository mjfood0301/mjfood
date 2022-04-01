package com.lee989898.todayeat.src.mylike.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lee989898.todayeat.R

class LikeRVAdapter(val items : ArrayList<String>): RecyclerView.Adapter<LikeRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.my_like_list_item_list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindItems(item: String){
            val image = itemView.findViewById<ImageView>(R.id.my_like_item_iv)
            val name = itemView.findViewById<TextView>(R.id.my_like_item_tv)
            val heartOff = itemView.findViewById<ImageView>(R.id.detail_heart_off_iv)
            val heartOn = itemView.findViewById<ImageView>(R.id.detail_heart_on_iv)

            // 나중에 서버랑 연결
//            image = item.
        }

    }

}