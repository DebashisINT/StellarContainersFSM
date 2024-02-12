package com.stellarcontainersfsm.features.location.api

import com.stellarcontainersfsm.features.location.shopdurationapi.ShopDurationApi
import com.stellarcontainersfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}