 package com.example.recycleviewdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val exampleList = ArrayList<ExampleItem>()
    private val adapter = ExampleAdapter(this@MainActivity, exampleList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exampleList.add(ExampleItem("Bánh", "Bánh, Bánh, Bánh, Bánh", "200.000"))
        exampleList.add(ExampleItem("Kẹo", "Kẹo ngon ", "35.000"))
        exampleList.add(ExampleItem("M008", "Vinamilk sẽ không làm bạn thất vọng", "10.000"))



        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
        recycler_view.setHasFixedSize(true)
        btnInsert.setOnClickListener {
            insertItem()
        }

    }

    private fun insertItem(){
        var maSp = inputMaSP.text
        var moTa = inputMoTa.text
        var giaTien = inputGiaTien.text

        if (maSp.isEmpty() || moTa.isEmpty() || giaTien.isEmpty()){
            Toast.makeText(this, "Nhập đủ các trường pls", Toast.LENGTH_SHORT).show()
        }else{
            exampleList.add(ExampleItem(maSp.toString(), moTa.toString(), giaTien.toString()))
            adapter.notifyDataSetChanged()
            maSp.clear()
            moTa.clear()
            giaTien.clear()
        }
    }
}