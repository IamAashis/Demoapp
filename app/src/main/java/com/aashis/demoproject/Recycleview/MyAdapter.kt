package com.aashis.demoproject.Recycleview

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aashis.demoproject.R
import com.aashis.demoproject.inflate

class MyAdapter(

    private val context: Context, private
    val myDataList: MutableList<MyData>
) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(parent.inflate(R.layout.view_adapter))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val myData = myDataList[position]

        holder.futsalImage.setImageDrawable(context.getDrawable(myData.drawable))
        holder.textviewAddress.text = myData.address
        holder.textviewName.text = myData.name
        holder.textviewSize.text = myData.size
    }

    override fun getItemCount() = myDataList.count()

}