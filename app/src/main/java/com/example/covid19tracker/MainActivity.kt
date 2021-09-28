package com.example.covid19tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

import com.example.covid19tracker.Utils.ViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: TrackerViewModel

    private val retrofitService = RetrofitService.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this, ViewModelFactory(Repository(retrofitService))).get(TrackerViewModel::class.java)
        viewModel.covidData()
    }
}