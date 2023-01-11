package com.uzb7.beeline.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.beeline.R
import com.uzb7.beeline.model.Tur

class TurAdapter(val list:ArrayList<Tur>):RecyclerView.Adapter<TurAdapter.TurViewHolder>() {
    class TurViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvTur=view.findViewById<TextView>(R.id.tv_tur)
        val ivbor=view.findViewById<ImageView>(R.id.iv_bor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TurViewHolder {
        return TurViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_turlar,parent,false))
    }

    override fun onBindViewHolder(holder: TurViewHolder, position: Int) {
        val tur=list[position]
        holder.apply {
            tvTur.text=tur.tur
            if(tur.bor==true){
                ivbor.visibility=View.VISIBLE
            }else{
                ivbor.visibility=View.GONE
            }
        }
    }

    override fun getItemCount()=list.size
}