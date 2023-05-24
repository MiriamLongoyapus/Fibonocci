package com.example.fibonocci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRvAdapter(var numberList: List<Int>): RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumberViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        var currentNumber = numberList.get(position)
        holder.tvNumber.text = currentNumber.toString()

    }

    override fun getItemCount(): Int {
        return numberList.size

    }

}
class NumberViewHolder(itemView: View):ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumbers)
}
