package com.ubaya.cerbungnmp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.cerbungnmp.databinding.ActivityHomeBinding
import com.ubaya.cerbungnmp.databinding.CerbungItemBinding

class CerbungAdapter():RecyclerView.Adapter<CerbungAdapter.CerbungViewHolder>() {
    class CerbungViewHolder(val binding: CerbungItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CerbungViewHolder {
        val binding = CerbungItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CerbungViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Global.ceritaBersambung.size
    }

    override fun onBindViewHolder(holder: CerbungViewHolder, position: Int) {
        val url = Global.ceritaBersambung[position].url
        with(holder.binding){
            val builder = Picasso.Builder(holder.itemView.context)
            builder.listener{picasso, uri, exception -> exception.printStackTrace()}
            Picasso.get().load(url).into(imgPoster)
            txtJudul.text= Global.ceritaBersambung[position].judul
            txtAuthor.text= "by " + Global.ceritaBersambung[position].penulis
            txtContent.text = Global.ceritaBersambung[position].sinopsis

        }

    }
}