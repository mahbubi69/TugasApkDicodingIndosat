package com.example.tugasapkdicodingindosat.model

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugasapkdicodingindosat.R

//mempersatukan dengan xml
class MobilViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.item_foto, parent, false
    )
) {
    val imgmobil = itemView.findViewById<ImageView>(R.id.cr_img_mobil)
    val namamobil = itemView.findViewById<TextView>(R.id.tv_nama_mobil)
    val tgl = itemView.findViewById<TextView>(R.id.tv_sub_nama_mobil)

    fun bind(dataMobil: Mobil) {
        Glide.with(itemView.context)
            .load(dataMobil.img)
            .into(imgmobil)

        namamobil.text = dataMobil.nama
        tgl.text = dataMobil.tahun
    }
}