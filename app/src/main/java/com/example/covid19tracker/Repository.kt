package com.example.covid19tracker

import androidx.lifecycle.MutableLiveData




class Repository constructor(private val retrofitService: RetrofitService) {

    fun getAllData() = retrofitService.getCovidData()
}