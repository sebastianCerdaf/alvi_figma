package com.example.myapplication.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.utils.extension.inflate

class ProductAdapter {
    fun getItemCount(): Int {
        return 3
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.fragment_product_list, parent, false)
        return CustomViewHolder(cellForRow)
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}
