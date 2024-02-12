package com.stellarcontainersfsm.features.stock.api

import com.stellarcontainersfsm.app.Pref
import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.stock.model.AddStockInputParamsModel
import com.stellarcontainersfsm.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 17-09-2019.
 */
class StockRepository(val apiService: StockApi) {

    fun addStock(addStock: AddStockInputParamsModel): Observable<BaseResponse> {
        return apiService.addStock(addStock)
    }

    fun getStockList(): Observable<NewStockListResponseModel> {
        return apiService.getStockList(Pref.session_token!!, Pref.user_id!!)
    }
}