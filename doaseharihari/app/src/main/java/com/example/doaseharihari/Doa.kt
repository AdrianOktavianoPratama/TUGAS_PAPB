package com.example.doaseharihari

import java.io.Serializable

data class Doa(
    val judul: String,
    val arab: String,
    val latin: String,
    val arti: String,
    val gambar: Int
) : Serializable