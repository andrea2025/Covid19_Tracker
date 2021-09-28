package com.example.covid19tracker

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class TrackerViewModel constructor(private val repository: Repository) : ViewModel() {
    val movieList = MutableLiveData<TrackerClass>()
    val errorMessage = MutableLiveData<String>()

    fun covidData() {
        val response = repository.getAllData()
        response.enqueue(object : Callback<TrackerClass> {
            override fun onResponse(call: Call<TrackerClass>, response: Response<TrackerClass>) {
                movieList.postValue(response.body())
                Log.i("respose", response.message())
            }


            override fun onFailure(call: Call<TrackerClass>, t: Throwable) {
                errorMessage.toString()
                Log.i("error", t.localizedMessage)
            }
        })
    }
}