package com.example.componentes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.VideoView
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var tarjetasList:ArrayList<Items>
    private lateinit var adapter:Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        recyclerView=findViewById(R.id.recyclerView)

        tarjetasList= ArrayList()
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Iglesia"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba2"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba3"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba4"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba5"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Iglesia"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba2"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba3"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba4"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba5"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Iglesia"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba2"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba3"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba4"))
        tarjetasList.add(Items(R.drawable.iglesiaaa,"Prueba5"))

        adapter= Adapter(tarjetasList)
        recyclerView.adapter=adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
}