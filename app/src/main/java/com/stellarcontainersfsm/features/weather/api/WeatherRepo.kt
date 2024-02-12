package com.stellarcontainersfsm.features.weather.api

import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.task.api.TaskApi
import com.stellarcontainersfsm.features.task.model.AddTaskInputModel
import com.stellarcontainersfsm.features.weather.model.ForeCastAPIResponse
import com.stellarcontainersfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}