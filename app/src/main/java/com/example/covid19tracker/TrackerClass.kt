package com.example.covid19tracker

data class TrackerClass(
    val `State Unassigned`: StateData,
    val `Andaman and Nicobar Islands`: AndamanandNicobarData,
    val `Andhra Pradesh`: AndhraPradeshData,

    )

data class StateData(
    val districtData: Unassigned,
    val statecode: String
)

data class Unassigned(
    val unassigned: DataModel
)

data class DataModel(
    val notes: String,
    val active: Int,
    val confirmed: Int,
    val migratedother: Int,
    val deceased: Int,
    val recovered: Int,
    val delta: Delta
)

data class Delta(
    val confirmed: Int,
    val deceased: Int,
    val recovered: Int
)

data class AndamanandNicobarData(
    val districtData: AndamanandNicobarList,
    val statecode: String
)

data class AndamanandNicobarList(
    val Nicobars: DataModel,
    val `North and Middle Andaman`: DataModel,
    val `South Andaman`: DataModel,
    val Unknown: DataModel
)

data class AndhraPradeshData(
    val districtData: AndhraPradeshList,
    val statecode: String
)

data class AndhraPradeshList(
    val `Foreign Evacuees`: DataModel
)


