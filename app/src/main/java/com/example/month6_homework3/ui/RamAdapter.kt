package com.example.month6_homework3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.month6_homework3.R
import com.example.month6_homework3.databinding.RamItemBinding

class RamAdapter : RecyclerView.Adapter<RamAdapter.RamHolder>() {

    private var ramList = emptyList<String>()

    class RamHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = RamItemBinding.bind(item)
        fun onBind(ram: String) = with(binding) {
//            imgItem.setImageResource(ram.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RamHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ram_item, parent, false)
        return RamHolder(view)
    }

    override fun onBindViewHolder(holder: RamHolder, position: Int) {
        holder.onBind(ramList[position])
    }

    override fun getItemCount(): Int {
        return ramList.size
    }
}