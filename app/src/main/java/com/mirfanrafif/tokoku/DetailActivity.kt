package com.mirfanrafif.tokoku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.mirfanrafif.tokoku.data.ListBarang
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    private lateinit var detailImage: ImageView
    private lateinit var namaBarang: TextView
    private lateinit var hargaBarang: TextView
    private lateinit var tambahKeranjangButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        detailImage = findViewById(R.id.Detail_fotoBarangImage)
        namaBarang = findViewById(R.id.Detail_namaBarangText)
        hargaBarang = findViewById(R.id.Detail_hargaBarangText)
        tambahKeranjangButton = findViewById(R.id.Detail_TambahKeranjangButton)

        val intent = intent
        val position = intent.getStringExtra("position")?.toInt() ?: 0
        val barang = ListBarang.dataBarang[position]

        Glide.with(this).load(barang.foto).centerCrop().into(detailImage)
        namaBarang.text = barang.nama
        hargaBarang.text = barang.harga.toString()
        tambahKeranjangButton.setOnClickListener {
            Toast
                .makeText(this,
                "Barang ${barang.nama} berhasil ditambahkan ke keranjang",
                Toast.LENGTH_LONG)
                .show()
        }
    }
}