package com.stellarcontainersfsm.features.location.shopRevisitStatus

import com.stellarcontainersfsm.features.location.shopdurationapi.ShopDurationApi
import com.stellarcontainersfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}