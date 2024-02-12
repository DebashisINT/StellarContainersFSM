package com.stellarcontainersfsm.features.location.shopRevisitStatus

import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.location.model.ShopDurationRequest
import com.stellarcontainersfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}