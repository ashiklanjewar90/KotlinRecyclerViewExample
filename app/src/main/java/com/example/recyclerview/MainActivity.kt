package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.programmingListRl)//Initialize recyclerView with findViewByID
        var pgmList = listOf<String>("Java","Python","C","C++")
        var programmingListAdapter:ProgrammingListAdapter = ProgrammingListAdapter(pgmList)
        /**
         * set layout manager to recyclerView and set adapter
         */
        var linearLayoutManager  = LinearLayoutManager(this@MainActivity)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = programmingListAdapter
    }
}