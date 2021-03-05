package com.mirfanrafif.tokoku

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mirfanrafif.tokoku.data.Barang

class BarangAdapter(val dataBarang: ArrayList<Barang>) : RecyclerView.Adapter<BarangAdapter.BarangViewHolder>() {
    inner class BarangViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var namaBarangText: TextView = itemView.findViewById(R.id.namaBarangText)
        var hargaBarangText: TextView = itemView.findViewById(R.id.hargaBarangText)
        var fotoImageView: ImageView = itemView.findViewById(R.id.fotoBarangImage)
        var container : CardView = itemView.findViewById(R.id.barang_container)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BarangAdapter.BarangViewHolder {
        val inflater = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.barang_item, parent, false)
        return BarangViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: BarangAdapter.BarangViewHolder, position: Int) {
        holder.apply {
            namaBarangText.text = dataBarang[position].nama
            hargaBarangText.text = dataBarang[position].harga.toString()
            Glide.with(holder.itemView.context)
                .load(dataBarang[position].foto)
                .centerCrop()
                .into(fotoImageView)
            container.setOnClickListener {
                val intent = Intent(holder.itemView.context, DetailActivity::class.java)
                intent.putExtra("position", position.toString())
                holder.itemView.context.startActivity(intent)
            }
        }
        Log.d("namaBarang", dataBarang[position].nama)
    }

    override fun getItemCount(): Int {
        return dataBarang.size
    }
}