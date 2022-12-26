package com.example.apirest

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.apirest.databinding.ItemDogsBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogsBinding.bind(view)

    fun bind(images:String){
        Picasso.get().load(images).into( binding.ivDog)
    }
}