package com.example.doaseharihari

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var doaAdapter: DoaAdapter
    private lateinit var listDoa: ArrayList<Doa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        listDoa = arrayListOf(
            Doa(
                "Doa Sebelum Makan",
                "اللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا",
                "Allahumma barik lana fima razaqtana wa qina 'adzaban nar",
                "Ya Allah, berkahilah rezeki yang Engkau berikan kepada kami dan peliharalah kami dari siksa neraka.",
                R.drawable.makan
            ),
            Doa(
                "Doa Sesudah Makan",
                "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا",
                "Alhamdulillahilladzi ath'amana wa saqana wa ja'alana minal muslimin",
                "Segala puji bagi Allah yang telah memberi kami makan dan minum serta menjadikan kami termasuk golongan orang-orang muslim.",
                R.drawable.sesudah_makan
            ),
            Doa(
                "Doa Sebelum Tidur",
                "بِاسْمِكَ اللَّهُمَّ أَحْيَا وَأَمُوتُ",
                "Bismikallahumma ahya wa amut",
                "Dengan nama-Mu ya Allah aku hidup dan aku mati.",
                R.drawable.tidur
            ),
            Doa(
                "Doa Bangun Tidur",
                "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا",
                "Alhamdulillahilladzi ahyana ba'da ma amatana wa ilaihin nusyur",
                "Segala puji bagi Allah yang menghidupkan kami kembali setelah mematikan kami, dan hanya kepada-Nya kami akan kembali.",
                R.drawable.bangun
            ),
            Doa(
                "Doa Keluar Rumah",
                "بِسْمِ اللَّهِ تَوَكَّلْتُ عَلَى اللَّهِ",
                "Bismillahi tawakkaltu 'alallah la haula wa la quwwata illa billah",
                "Dengan nama Allah, aku bertawakal kepada Allah.Tidak ada daya dan kekuatan kecuali dengan pertolongan Allah.",
                R.drawable.keluar_rumah
            )
        )

        doaAdapter = DoaAdapter(listDoa) { doa ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data_doa", doa)
            startActivity(intent)
        }

        recyclerView.adapter = doaAdapter
    }
}