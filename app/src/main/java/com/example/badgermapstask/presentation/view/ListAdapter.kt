package com.example.badgermapstask.presentation.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.badgermapstask.databinding.ItemBinding

class ListAdapter(var list:List<String>):RecyclerView.Adapter<ListAdapter.ListHolder>() {


    class ListHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) {
            binding.itemName.text = text

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val binding = ItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ListHolder(binding)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}