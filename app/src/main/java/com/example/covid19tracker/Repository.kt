package com.example.covid19tracker

class Repository constructor(private val retrofitService: RetrofitService) {

    fun getAllData() = retrofitService.getCovidData()
}