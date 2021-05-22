package com.example.tugasapkdicodingindosat

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasapkdicodingindosat.handler.OnClikMobil
import com.example.tugasapkdicodingindosat.model.Mobil
import com.example.tugasapkdicodingindosat.model.MobilAdapter
import com.example.tugasapkdicodingindosat.model.MobilDataSet
import com.example.tugasapkdicodingindosat.model.MobilDetailActivity
import java.util.ArrayList

class ListFotoActivity : AppCompatActivity(), OnClikMobil {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_foto)
        supportActionBar!!.setTitle("Daftar Mobil")

        val datambl = MobilDataSet().listMobil()
        menampilkanRv(datambl)
    }

    fun menampilkanRv(datamobil1: ArrayList<Mobil>) {
        val rvmobil = findViewById<RecyclerView>(R.id.recyclerview_mobil)
        rvmobil.adapter = MobilAdapter(datamobil1, this)
        rvmobil.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun mobilonClik(Mobil1: Mobil) {
        val intenMObil = Intent(this, MobilDetailActivity::class.java)
        intenMObil.putExtra(MobilDetailActivity.IMGMOBIL, Mobil1.img)
        intenMObil.putExtra(MobilDetailActivity.NAMAMOBIL, Mobil1.nama)
        intenMObil.putExtra(MobilDetailActivity.DETAILMOBIL, Mobil1.detail)
        startActivity(intenMObil)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.icon_infoku) {
            val inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }
        return super.onOptionsItemSelected(item)
    }
}
