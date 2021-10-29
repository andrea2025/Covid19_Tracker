package com.example.covid19tracker

data class Tracker (
//    val infected:Int,
//    val deceased:Int,
//    val infectedByRegion: List<Region>,
    val activeCases: Int,
    val activeCasesNew: Int,
    val recovered: Int,
    val recoveredNew: Int,
    val deaths: Int,
    val deathsNew: Int,
    val previousDayTests:Int,
    val totalCases:Int,
    val regionData: List<Region>,
)

data class Region(
    val region : String,
//    val infectedCount:String,
//val deceasedCount:String
    val activeCases : Int,
    val newInfected : Int,
    val recovered : Int,
    val newRecovered : Int,
    val deceased : Int,
    val newDeceased : Int,
    val totalInfected : Int
)
