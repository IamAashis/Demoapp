package com.aashis.demoproject.Recycleview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aashis.demoproject.R

class MyViewHolder(private val itemview: View):RecyclerView.ViewHolder(itemview) {
val futsalImage:ImageView = itemview.findViewById(R.id.fstImage)
    val textviewName: TextView = itemView.findViewById(R.id.Name)
    val textviewAddress: TextView = itemView.findViewById(R.id.address)
    val textviewSize: TextView = itemView.findViewById(R.id.futsal_size)


}