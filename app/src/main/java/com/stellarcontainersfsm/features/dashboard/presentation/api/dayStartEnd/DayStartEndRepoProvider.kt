package com.stellarcontainersfsm.features.dashboard.presentation.api.dayStartEnd

import com.stellarcontainersfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.stellarcontainersfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}