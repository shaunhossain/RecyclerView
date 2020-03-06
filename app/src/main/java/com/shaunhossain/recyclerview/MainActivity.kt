package com.shaunhossain.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.shaunhossain.recyclerview.adapter.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpledata = getDummyData(500)
        recycler_view_contanier.adapter = SimpleAdapter(simpledata)
        recycler_view_contanier.layoutManager = LinearLayoutManager(this)
        recycler_view_contanier.setHasFixedSize(true)

    }
    fun getDummyData(size: Int): List<SimpleData>{
        val list = ArrayList<SimpleData>()
        for (i in 0 until size){
            val drawable = when(i%3){
                0 -> R.drawable.ic_android_icon
                1 -> R.drawable.ic_attach_money
                else -> R.drawable.ic_beach_access
            }
            val item = SimpleData(drawable,"Item $i","The line number is $i")
            list +=item
        }
        return list
    }
}
