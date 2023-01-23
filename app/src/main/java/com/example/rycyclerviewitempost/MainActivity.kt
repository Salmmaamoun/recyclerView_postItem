package com.example.rycyclerviewitempost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: PostAdapter
    lateinit var layautManger: RecyclerView.LayoutManager
    lateinit var listItem:MutableList<PostItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycle)
        layautManger = LinearLayoutManager(this)
                creatItem()
        adapter=PostAdapter(listItem)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=layautManger


    }


    private fun creatItem() {
        listItem=mutableListOf<PostItem>()
        for (i in 0..20) {
            listItem.add(PostItem("salma",
                R.drawable.person,
                "2hrs.",
                R.drawable.ic_baseline_language_24,
                "...",
                "Buckle Up,becouse Change is Coming to World Press ",
                "http://unblast.com/color-schema",
                R.drawable.post_img,
                R.drawable.like,
                12,
                R.drawable.photo,
                "5 share",
                R.drawable.like,
                "like",
                R.drawable.chat,
                "commit",
                R.drawable.shr,
                "share"
            ))
        }
    }
}