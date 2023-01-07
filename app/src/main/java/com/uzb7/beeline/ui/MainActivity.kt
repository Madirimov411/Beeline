package com.uzb7.beeline.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.beeline.R
import com.uzb7.beeline.adapter.XizmatAdapter
import com.uzb7.beeline.model.Xizmat

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<Xizmat>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        list=loadList()
        val rvXizmatlar=findViewById<RecyclerView>(R.id.rv_xizmatlar)
        val adapter=XizmatAdapter(list)
        rvXizmatlar.adapter=adapter
        rvXizmatlar.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        adapter.ulashish={
            var i=Intent(Intent.ACTION_SEND)
            i.setType("text/plain")
            i.putExtra(Intent.EXTRA_TEXT,it)
            startActivity(Intent.createChooser(i,"Xizmat turini ulashish"))
        }
        adapter.haqida={
            var i=Intent(this,XizmatHaqidaActivity::class.java)
            i.putExtra("list",it)
            startActivity(i)
        }
    }

    private fun loadList(): ArrayList<Xizmat> {
        val mylist=ArrayList<Xizmat>()
        mylist.add(Xizmat(
            "INTERNET-PAKET 150 GB",
            "150 000 so'm/30 kun",
            "150 000 so'm/30 kun",
            "150 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 100 GB",
            "100 000 so'm/30 kun",
            "100 000 so'm/30 kun",
            "100 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 75 GB",
            "75 000 so'm/30 kun",
            "85 000 so'm/30 kun",
            "75 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 150 GB",
            "150 000 so'm/30 kun",
            "150 000 so'm/30 kun",
            "150 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 100 GB",
            "100 000 so'm/30 kun",
            "100 000 so'm/30 kun",
            "100 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 75 GB",
            "75 000 so'm/30 kun",
            "85 000 so'm/30 kun",
            "75 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 150 GB",
            "150 000 so'm/30 kun",
            "150 000 so'm/30 kun",
            "150 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 100 GB",
            "100 000 so'm/30 kun",
            "100 000 so'm/30 kun",
            "100 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 75 GB",
            "75 000 so'm/30 kun",
            "85 000 so'm/30 kun",
            "75 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 150 GB",
            "150 000 so'm/30 kun",
            "150 000 so'm/30 kun",
            "150 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 100 GB",
            "100 000 so'm/30 kun",
            "100 000 so'm/30 kun",
            "100 GB/30 kun"
        ))
        mylist.add(Xizmat(
            "INTERNET-PAKET 75 GB",
            "75 000 so'm/30 kun",
            "85 000 so'm/30 kun",
            "75 GB/30 kun"
        ))
        return mylist
    }
}