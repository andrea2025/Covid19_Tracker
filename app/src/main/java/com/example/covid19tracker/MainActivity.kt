package com.example.covid19tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.widget.ContentLoadingProgressBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.covid19tracker.Utils.ViewModelFactory
import com.example.covid19tracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var progressBar: ContentLoadingProgressBar
    private val viewModel by lazy { ViewModelProvider(this,ViewModelFactory(Repository(retrofitService))).get(TrackerViewModel::class.java) }


    private val retrofitService = RetrofitService.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val recyclerView = binding.recylerView
        progressBar = binding.progressBar
        val adapter = TrackerAdapter()
        recyclerView.adapter = adapter
        showProgress()
        viewModel.response.observe(this, Observer{
            adapter.setMovieList(it.regionData)
            binding.total.text = "Region Total: " + it.totalCases.toString()
            Log.i("ggg",it.toString())
        })
        viewModel.covidData()

    }

    fun showProgress(){
        viewModel.isLoading.observe(this, Observer{
            progressBar.visibility = if(it) View.VISIBLE else View.GONE

        })
    }
}