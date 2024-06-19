package com.youcef_bounaas.skycast.model.weather

import com.google.gson.annotations.SerializedName

data class Main (
    @SerializedName("temp") var temp: Double? = null,
    @SerializedName("feels_like") var feelsLike: Double? = null,
    @SerializedName("temp_min") var temp_min: Double? = null,
    @SerializedName("temp_max") var temp_max: Double? = null,
    @SerializedName("pressure") var pressure: Double? = null,
    @SerializedName("humidity") var humidity: Double? = null,
)