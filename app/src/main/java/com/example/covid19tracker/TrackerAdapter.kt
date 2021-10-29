package com.example.covid19tracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19tracker.databinding.DataItemBinding

class TrackerAdapter() :
    RecyclerView.Adapter<TrackerAdapter.ViewHolder>() {

    //lateinit var movies : Tracker
    var movies = mutableListOf<Region>()
    //lateinit var region: Region

    fun setMovieList(movies: List<Region>) {
        this.movies = movies.toMutableList()
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: DataItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
        val binding = DataItemBinding.inflate(adapterLayout,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = movies[position]

        holder.binding.activeCase.text = item.activeCases.toString()
        holder.binding.deceased.text =  item.deceased.toString()
        holder.binding.region.text =  item.region
        holder.binding.recovered.text = item.recovered.toString()
       // holder.binding.totalCase.text= "Total: " + item.totalInfected.toString()

    }

    override fun getItemCount(): Int {
            return movies.size
    }
}