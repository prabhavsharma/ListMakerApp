package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListMakerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
  val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
  val listTitle = itemView.findViewById(R.id.itemString) as TextView

}