package com.example.recycleviewdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(val mContext: Context, private val exampleList: ArrayList<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {


    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txtMaSP = itemView.txtMaSP
        val txtGiaTien = itemView.txtGIaTien
        val txtMoTa = itemView.txtMoTa

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val imgView = LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return ExampleViewHolder(imgView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.txtMaSP.text = currentItem.maSp
        holder.txtMoTa.text = currentItem.moTa
        holder.txtGiaTien.text = currentItem.giaTien

                holder.itemView.setOnClickListener {
                    var maSP = holder.itemView.txtMaSP.text.toString()
                    var moTa = holder.itemView.txtMoTa.text.toString()
                    var giaTien = holder.itemView.txtGIaTien.text.toString()
                    val intent = Intent(mContext, profile::class.java)
                    intent.putExtra("MaSP", maSP)
                    intent.putExtra("MoTa", moTa)
                    intent.putExtra("GiaTien", giaTien)
                    startActivity(mContext, intent, Bundle())

        }


    }

    override fun getItemCount() = exampleList.size
}