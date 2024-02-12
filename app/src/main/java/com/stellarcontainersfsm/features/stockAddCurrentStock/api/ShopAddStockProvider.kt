package com.stellarcontainersfsm.features.stockAddCurrentStock.api

import com.stellarcontainersfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.stellarcontainersfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}