package com.mirfanrafif.tokoku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mirfanrafif.tokoku.data.ListBarang

class MainActivity : AppCompatActivity() {
    private lateinit var barangRv : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        barangRv = findViewById(R.id.barangRv)

        val barangAdapter = BarangAdapter(ListBarang.dataBarang)
        barangRv.adapter = barangAdapter
        barangRv.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profil -> {
                val intent = Intent(this, ProfilActivity::class.java)
                startActivity(intent)
            }
        }
    }
}