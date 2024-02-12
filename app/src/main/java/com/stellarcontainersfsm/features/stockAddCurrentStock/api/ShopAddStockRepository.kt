package com.stellarcontainersfsm.features.stockAddCurrentStock.api

import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.location.model.ShopRevisitStatusRequest
import com.stellarcontainersfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.stellarcontainersfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.stellarcontainersfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.stellarcontainersfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}