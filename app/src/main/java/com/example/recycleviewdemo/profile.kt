package com.example.recycleviewdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        var maSp:String = intent.getStringExtra("MaSP").toString()
        var moTa:String = intent.getStringExtra("MoTa").toString()
        var giaTien:String = intent.getStringExtra("GiaTien").toString()

        tvMaSP.text = maSp
        tvMoTa.text = moTa
        tvGiaTien.text = giaTien


    }
}