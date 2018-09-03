package com.example.afriz.footballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.afriz.footballclub.R.array.club_image
import com.example.afriz.footballclub.R.array.club_name
import com.example.afriz.footballclub.R.layout.activity_main
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        initData()
        val list = findViewById<RecyclerView>(R.id.club_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = Football(this, items)
    }
    private fun initData(){
        val name = resources.getStringArray(club_name)
        val image = resources.obtainTypedArray(club_image)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0)))
        }
        image.recycle()
    }
}
