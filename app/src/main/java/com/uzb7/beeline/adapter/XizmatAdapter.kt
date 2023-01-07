package com.uzb7.beeline.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.beeline.R
import com.uzb7.beeline.model.Xizmat

class XizmatAdapter (val list:ArrayList<Xizmat>):RecyclerView.Adapter<XizmatAdapter.XizmatViewHolder>() {
    var ulashish:((String) -> Unit)?=null
    var haqida:((ArrayList<String>) -> Unit)?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XizmatViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_xizmatlar,parent,false)
        return XizmatViewHolder(view)
    }

    override fun onBindViewHolder(holder: XizmatViewHolder, position: Int) {
        val xizmat=list[position]
        holder.apply {
            tvXizmatTuri.text=xizmat.xizmatturi
            tvXizmatNarxi.text=xizmat.xizmatnarxi
            tvXizmatMuddati.text=xizmat.xizmatmuddati
            tvXizmatHajmi.text=xizmat.xizmatxajmi
            bUlashish.setOnClickListener {
                ulashish?.invoke("${xizmat.xizmatturi}\n${xizmat.xizmatnarxi}\n${xizmat.xizmatmuddati}\n${xizmat.xizmatxajmi}")
            }
            llXizmatHaqida.setOnClickListener {
                val a=ArrayList<String>()
                a.add(tvXizmatTuri.text.toString())
                a.add(tvXizmatNarxi.text.toString())
                a.add(tvXizmatMuddati.text.toString())
                a.add(tvXizmatHajmi.text.toString())
                haqida?.invoke(a)
            }
        }
    }

    override fun getItemCount() = list.size




    class XizmatViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvXizmatTuri=view.findViewById<TextView>(R.id.tv_xizmat_turi)
        val tvXizmatMuddati=view.findViewById<TextView>(R.id.tv_xizmat_muddati)
        val tvXizmatNarxi=view.findViewById<TextView>(R.id.tv_xizmat_narxi)
        val tvXizmatHajmi=view.findViewById<TextView>(R.id.tv_xizmat_xajmi)
        val bUlashish=view.findViewById<TextView>(R.id.b_ulashish)
        val llXizmatHaqida=view.findViewById<LinearLayout>(R.id.ll_xizmat_haqida)
    }


}