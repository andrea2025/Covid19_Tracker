package com.example.covid19tracker

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface RetrofitService {
         @GET("key-value-stores/toDWvRj1JpTXiM8FF/records/LATEST?disableRedirect=true")
         fun getCovidData() : Call<Tracker>

         companion object {

             var retrofitService: RetrofitService? = null

             fun getInstance() : RetrofitService {

                 if (retrofitService == null) {
                     val retrofit = Retrofit.Builder()
                         .baseUrl("https://api.apify.com/v2/")
                         .addConverterFactory(GsonConverterFactory.create())
                         .build()
                     retrofitService = retrofit.create(RetrofitService::class.java)
                 }
                 return retrofitService!!
             }
         }
     }
