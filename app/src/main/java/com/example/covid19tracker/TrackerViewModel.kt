package com.example.covid19tracker

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TrackerViewModel constructor(private val repository: Repository) : ViewModel() {
    val isLoading: MutableLiveData<Boolean> = MutableLiveData()

    private val _response = MutableLiveData<Tracker>()
    val response: LiveData<Tracker>
        get() = _response

    init {
        covidData()
    }


//    fun getIsLoading(): LiveData<Boolean?>? {
//        //return repository.isLoading
//    }

    fun covidData() {
        val response = repository.getAllData()
        response.enqueue(object : Callback<Tracker>{
            override fun onResponse(call: Call<Tracker>, response: Response<Tracker>) {
               isLoading.postValue(true)
              _response.value = response.body()
               Log.i("respose", response.message())
                isLoading.postValue(false)

            }

            override fun onFailure(call: Call<Tracker>, t: Throwable) {
                isLoading.postValue(false)
                Log.i("error",   t.toString())
            }

        })
    }
}



