package com.example.doaseharihari

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDoa = findViewById<ImageView>(R.id.imgDetail)
        val txtJudul = findViewById<TextView>(R.id.txtDetailJudul)
        val txtArab = findViewById<TextView>(R.id.txtArab)
        val txtLatin = findViewById<TextView>(R.id.txtLatin)
        val txtArti = findViewById<TextView>(R.id.txtArti)

        val doa = intent.getSerializableExtra("data_doa") as Doa

        imgDoa.setImageResource(doa.gambar)
        txtJudul.text = doa.judul
        txtArab.text = doa.arab
        txtLatin.text = doa.latin
        txtArti.text = doa.arti
    }
}