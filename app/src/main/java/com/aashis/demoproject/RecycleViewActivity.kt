package com.aashis.demoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aashis.demoproject.Recycleview.MyAdapter
import com.aashis.demoproject.Recycleview.MyData

class RecycleViewActivity : AppCompatActivity() {

    private lateinit var myAdapter: MyAdapter
    private lateinit var recyclerViewNew: RecyclerView
    private lateinit var myDataLi: MutableList<MyData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)


        recyclerViewNew = findViewById(R.id.recyclerViewNew)
        initRecyclerView()

    }


    private fun initRecyclerView() {
        myDataLi = ArrayList()
        myDataLi.add(MyData(R.drawable.imageone,"Duku Futsal", "Baluwatar", "98451245"))
        myDataLi.add(MyData(R.drawable.imageone,"Samakhusi Futsal", "Samakhusi", "98984545"))
        myDataLi.add(MyData(R.drawable.imageone,"G4 Futsal", "Panipokhari", "9845456"))
        myAdapter = MyAdapter(this, myDataLi)
        recyclerViewNew.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewNew.adapter = myAdapter
    }

}