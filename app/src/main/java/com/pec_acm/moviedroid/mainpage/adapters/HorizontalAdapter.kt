package com.pec_acm.moviedroid.mainpage.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pec_acm.moviedroid.R

class HorizontalAdapter(private val images:List<Pair<String,String>> , val context: Context):RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {
    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imginwa)
        val movieTitle:TextView = itemView.findViewById(R.id.movie_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.image_rv,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val image = images[position]
        Glide.with(context).load(image.first).into(holder.image)
        holder.movieTitle.text = image.second
    }

    override fun getItemCount(): Int {
        return images.size
    }
}