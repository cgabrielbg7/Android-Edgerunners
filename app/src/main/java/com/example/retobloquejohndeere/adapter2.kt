package com.example.retobloquejohndeere

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retobloquejohndeere.databinding.ItemTipovideoBinding
import com.example.retobloquejohndeere.databinding.ItemVideoBinding

class adapter2(var context: Context, var data: List<SelectVideo>) : RecyclerView.Adapter<adapter2.ViewHolder>()     {


    class ViewHolder (val binding: ItemVideoBinding) : RecyclerView.ViewHolder(binding.root)  {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemVideoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            textViewNombre.text  = data[position].nombre
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}