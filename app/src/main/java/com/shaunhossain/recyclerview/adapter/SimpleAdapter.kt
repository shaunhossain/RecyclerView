package com.shaunhossain.recyclerview.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.simple_item.view.*

class SimpleAdapter :RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class SimpleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageeView: ImageView = itemView.image
        val title: TextView = itemView.title
        val description: TextView = itemView.description

    }
}