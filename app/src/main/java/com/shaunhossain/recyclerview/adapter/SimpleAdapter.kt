package com.shaunhossain.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.recyclerview.R
import com.shaunhossain.recyclerview.SimpleData
import kotlinx.android.synthetic.main.simple_item.view.*

class SimpleAdapter(private val simpleData: List<SimpleData>) :RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.simple_item,parent,false)
        return SimpleViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return simpleData.size
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        val currentItem = simpleData[position]
        holder.imageeView.setImageResource(currentItem.imageResource)
        holder.title.text = currentItem.title
        holder.description.text = currentItem.description
    }

    class SimpleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageeView: ImageView = itemView.image
        val title: TextView = itemView.title
        val description: TextView = itemView.description

    }
}