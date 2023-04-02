package com.example.componentes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Adapter(val tarjetasList:ArrayList<Items>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val textView: TextView =itemView.findViewById(R.id.textView)

    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Adapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item,p0,false))
    }

    override fun onBindViewHolder(p0: Adapter.MyViewHolder, p1: Int) {
        val item=tarjetasList[p1]
        p0.textView.text=item.name
        p0.imageView.setImageResource(item.image)


    }


    override fun getItemCount(): Int {
        return tarjetasList.size
    }

}