package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListMakerAdapter : RecyclerView.Adapter<ListMakerViewHolder>() {

    val listTitles = arrayOf("Shopping list", "cooking List", "Cleaning List", "Miscellaneous list")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMakerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_maker_row, parent, false)
        return ListMakerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }

    override fun onBindViewHolder(holder: ListMakerViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = listTitles[position]

    }
}