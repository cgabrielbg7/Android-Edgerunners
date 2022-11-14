package com.example.retobloquejohndeere

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retobloquejohndeere.databinding.ItemTipovideoBinding

class adapter(var context: Context, var data: List<Videos>) : RecyclerView.Adapter<adapter.ViewHolder>()     {


    class ViewHolder (val binding: ItemTipovideoBinding) : RecyclerView.ViewHolder(binding.root)  {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemTipovideoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            textViewTipo.text  = data[position].tipo
        }

        Glide.with(context)
            .load(data[position].imagen_url)
            .into(holder.binding.imageView)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}