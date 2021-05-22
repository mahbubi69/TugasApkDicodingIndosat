package com.example.tugasapkdicodingindosat.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.tugasapkdicodingindosat.ListFotoActivity
import com.example.tugasapkdicodingindosat.R
import org.w3c.dom.Text

class MobilDetailActivity : AppCompatActivity() {

    companion object {
        const val IMGMOBIL = "img"
        const val NAMAMOBIL = "namamobil"
        const val DETAILMOBIL = "detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobil_detail)

        supportActionBar!!.setTitle("Detail")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        var imgmobildetail = intent.getIntExtra(IMGMOBIL, 0)
        var namamobildetail = intent.getStringExtra(NAMAMOBIL)
        var mobildetail = intent.getStringExtra(DETAILMOBIL)

        var timgdetail = findViewById<ImageView>(R.id.img_detail_mobil)
        var tnamamobildetail = findViewById<TextView>(R.id.tv_detail_nama_mobil)
        var tdetailmobil = findViewById<TextView>(R.id.tv_detail_info_mobil)

        Glide.with(this)
            .load(imgmobildetail)
            .into(timgdetail)

        tnamamobildetail.text = namamobildetail
        tdetailmobil.text = mobildetail

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}