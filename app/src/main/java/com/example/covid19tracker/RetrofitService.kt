package com.example.covid19tracker

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface RetrofitService {
         @GET("state_district_wise.json")
         fun getCovidData() : Call<TrackerClass>

         companion object {

             var retrofitService: RetrofitService? = null

             fun getInstance() : RetrofitService {

                 if (retrofitService == null) {
                     val retrofit = Retrofit.Builder()
                         .baseUrl("https://api.covid19india.org/")
                         .addConverterFactory(GsonConverterFactory.create())
                         .build()
                     retrofitService = retrofit.create(RetrofitService::class.java)
                 }
                 return retrofitService!!
             }
         }
     }
