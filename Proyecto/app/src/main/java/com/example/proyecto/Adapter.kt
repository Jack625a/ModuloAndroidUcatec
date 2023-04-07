package com.example.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val tarjetasList:ArrayList<Items>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView =itemView.findViewById(R.id.imageView)
        val textView: TextView =itemView.findViewById(R.id.textView)
        val cardView: CardView = itemView.findViewById(R.id.cardView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item=tarjetasList[position]
        holder.imageView.setImageResource(item.image)
        holder.textView.text=item.name
        holder.cardView.setOnClickListener {
            println("click on ${holder.textView.text} en enviar...")
        }

    }

    override fun getItemCount(): Int {
        return tarjetasList.size
    }

}