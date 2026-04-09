package com.example.doaseharihari

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoaAdapter(
    private val listDoa: ArrayList<Doa>,
    private val onClick: (Doa) -> Unit
) : RecyclerView.Adapter<DoaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgDoa: ImageView = itemView.findViewById(R.id.imgDoa)
        val txtJudul: TextView = itemView.findViewById(R.id.txtJudul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val doa = listDoa[position]
        holder.imgDoa.setImageResource(doa.gambar)
        holder.txtJudul.text = doa.judul

        holder.itemView.setOnClickListener {
            onClick(doa)
        }
    }

    override fun getItemCount(): Int = listDoa.size
}