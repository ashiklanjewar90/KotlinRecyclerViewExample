package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

/*
Created by ashik1.lanjewar on 07/09/23
*/
/**
 * Step 1: Create on Adapter Class eg. ProgrammingAdapter extends Adapter
 * Step 2: Pass parameter to extended Adapter<VH> of your viewHolder type,
 * here it is ProgrammingViewHolder
 * Step 3: Implement all the methods like onCreateViewHolder, onBindViewHolder and getItemCount
 * Step 4: Create constructor of ProgrammingAdapter to receive list of data to view in list,
 * create an list in adapter and assign passed data to list
 */
class ProgrammingListAdapter(dataListParam:List<String>)
    : Adapter<ProgrammingListAdapter.ProgrammingListViewHolder>() {
    var  dataList =  dataListParam

    /**
     * create  object of layoutInflator
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingListViewHolder {
        var layoutInflator:LayoutInflater = LayoutInflater.from(parent.context)
        var view:View =  layoutInflator.inflate(R.layout.item_row_view,parent,false)
        return ProgrammingListViewHolder(view)
    }

    /**
     * bind all add to holder with respect to position
     */
    override fun onBindViewHolder(holder: ProgrammingListViewHolder, position: Int) {
        holder.tvRowHeader.text = dataList.get(position)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    /**
     * create one ViewHolder class which will hold the view to
     * retain as when required eg. class ProgrammingViewHolder extends  Viewholder
     */
    class ProgrammingListViewHolder(itemView: View) : ViewHolder(itemView) {
        /**
         * initialize all list item views
         */
        var tvRowHeader:TextView = itemView.findViewById(R.id.tvRowHeader)
    }
}