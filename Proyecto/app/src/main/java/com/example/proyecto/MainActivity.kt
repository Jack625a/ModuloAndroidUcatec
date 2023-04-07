package com.example.proyecto

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var enviarButton: Button
    lateinit var webView: WebView
    lateinit var videoView: VideoView
    var contador = 0
    private lateinit var recyclerView: RecyclerView
    private lateinit var tarjetasList: ArrayList<Items>
    private lateinit var adapter: Adapter
    lateinit var animationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_view)

        recyclerView = findViewById(R.id.recycleView)
        tarjetasList = ArrayList()
        tarjetasList.add(Items(R.drawable.iglesia, "Iglesia"))
        tarjetasList.add(Items(R.drawable.library, "Librería"))
        tarjetasList.add(Items(R.drawable.biblia, "Biblia"))
        tarjetasList.add(Items(R.drawable.iglesia, "Iglesia"))
        tarjetasList.add(Items(R.drawable.library, "Librería"))
        tarjetasList.add(Items(R.drawable.biblia, "Biblia"))
        tarjetasList.add(Items(R.drawable.iglesia, "Iglesia"))
        tarjetasList.add(Items(R.drawable.library, "Librería"))
        tarjetasList.add(Items(R.drawable.biblia, "Biblia"))
        println(tarjetasList)

        adapter = Adapter(tarjetasList)
        recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(this)

        animationButton = findViewById<Button>(R.id.button)
        animationButton.setOnClickListener {
            println("Iniciar animación...")
            recyclerView.startLayoutAnimation()
        }


/*
        val dateEditText = findViewById<EditText>(R.id.dateEditTextDialog)
        dateEditText.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                { _, y, m, d -> dateEditText.setText("$d/${m + 1}/$y") },
                year, month, day
            )
            datePickerDialog.show()
        }

        val numberEditText = findViewById<EditText>(R.id.numberEditText)
        val filters = arrayOf<InputFilter>(InputFilter { source, _, _, _, _, _ ->
            val regex = Regex("^[1-9][0-9]*$")
            if (source.toString().matches(regex)) {
                source
            } else {
                ""
            }
        })
        numberEditText.filters = filters

        enviarButton = findViewById<Button>(R.id.enviar)
        enviarButton.setOnClickListener {
            this.acumularContador()
            println("click ${this.contador} en enviar...")
        }
*/
/*
        webView=findViewById(R.id.webView)
        webView.settings.setJavaScriptEnabled(true)

        webView.webViewClient=object: WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
*/
        // activity_main
/*
        videoView=findViewById(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val webUri = Uri.parse("https://www.w3schools.com/html/mov_bbb.mp4")
        val localUri = Uri.parse("android.resource://$packageName/${R.raw.tutorialvideo}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(localUri)
        videoView.pause()
        videoView.stopPlayback()
        videoView.start()
*/
    }
/*
    fun acumularContador() {
        this.contador ++
    }
*/
}