package com.example.componentes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Adapter(val tarjetasList:ArrayList<Itemm>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val textView: TextView =itemView.findViewById(R.id.textView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        val item=tarjetasList[position]
        holder.textView.text=item.name
        holder.imageView.setImageResource(item.image)


    }


    override fun getItemCount(): Int {
        return tarjetasList.size
    }

}