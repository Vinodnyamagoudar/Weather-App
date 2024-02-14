package com.example.weatherappyt

data class WeatherApp(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)

// to use this list we need to convert json file so we need to add 2 dependencies
// those are gson converter(Gson allows you to convert Java objects into JSON format)
// and retrofit(used to fetch api data)