package com.stellarcontainersfsm.features.weather.api

import com.stellarcontainersfsm.features.task.api.TaskApi
import com.stellarcontainersfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}