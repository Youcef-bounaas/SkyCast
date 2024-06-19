package com.youcef_bounaas.skycast.model.forecast

import com.google.gson.annotations.SerializedName
import com.youcef_bounaas.skycast.model.weather.Clouds
import com.youcef_bounaas.skycast.model.weather.Main
import com.youcef_bounaas.skycast.model.weather.Sys
import com.youcef_bounaas.skycast.model.weather.Weather
import com.youcef_bounaas.skycast.model.weather.Wind

data class CustomList (
    @SerializedName("dt") var dt: Int? = null,
    @SerializedName("main") var main: Main? = Main(),
    @SerializedName("weather") var weather: ArrayList<Weather>? = arrayListOf(),
    @SerializedName("clouds") var clouds: Clouds? = Clouds(),
    @SerializedName("wind") var wind: Wind? = Wind(),
    @SerializedName("visibility") var visibility: Int? = null,
    @SerializedName("pop") var pop: Double? = null,
    @SerializedName("sys") var sys: Sys? = Sys(),
    @SerializedName("dt_txt") var dtTxt: String? = null,

    )