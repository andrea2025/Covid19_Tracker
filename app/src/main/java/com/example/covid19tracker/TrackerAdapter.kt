package com.example.covid19tracker

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TrackerAdapter(private val dataSet: TrackerClass) :
    RecyclerView.Adapter<TrackerAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackerAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TrackerAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}