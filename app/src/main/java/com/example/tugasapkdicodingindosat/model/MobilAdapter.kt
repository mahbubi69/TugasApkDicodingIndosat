package com.example.tugasapkdicodingindosat.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasapkdicodingindosat.ListFotoActivity
import java.util.ArrayList

class MobilAdapter(
    private val datamobilku: ArrayList<Mobil>, private val onMobilClik: ListFotoActivity
) : RecyclerView.Adapter<MobilViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MobilViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return datamobilku.size
    }

    override fun onBindViewHolder(holder: MobilViewHolder, position: Int) {
        holder.bind(datamobilku[position])
        holder.itemView.setOnClickListener{
            onMobilClik.mobilonClik(datamobilku[position])
        }
    }
}