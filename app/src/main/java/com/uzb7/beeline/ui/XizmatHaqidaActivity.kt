package com.uzb7.beeline.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.uzb7.beeline.R

class XizmatHaqidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xizmat_haqida)
        initViews()
    }

    private fun initViews() {
        val tvTuri=findViewById<TextView>(R.id.tv_xizmat_turi1)
        val tvMuddati=findViewById<TextView>(R.id.tv_xizmat_muddati1)
        val tvMuddati2=findViewById<TextView>(R.id.tv_xizmat_muddati2)
        val tvNarxi=findViewById<TextView>(R.id.tv_xizmat_narxi1)
        val tvHajmi=findViewById<TextView>(R.id.tv_xizmat_hajmi1)
        val tvHajmi2=findViewById<TextView>(R.id.tv_xizmat_hajmi2)
        val tvSummasi=findViewById<TextView>(R.id.tv_xizmat_summasi)
        val list=intent.getStringArrayListExtra("list")
        tvTuri.text= list?.get(0).toString()
        tvMuddati.text= list?.get(1).toString()
        val b=list?.get(1).toString().split("/")
        tvMuddati2.text=b[1]
        val s=list?.get(2).toString().split("/")
        tvNarxi.text= s[0]
        val a=list?.get(3).toString().split("/")
        tvHajmi.text= a[0]
        tvHajmi2.text= a[0]
        tvSummasi.text= s[0]
    }
}