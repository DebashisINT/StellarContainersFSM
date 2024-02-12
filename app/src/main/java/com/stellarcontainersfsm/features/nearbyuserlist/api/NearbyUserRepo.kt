package com.stellarcontainersfsm.features.nearbyuserlist.api

import com.stellarcontainersfsm.app.Pref
import com.stellarcontainersfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.stellarcontainersfsm.features.newcollection.model.NewCollectionListResponseModel
import com.stellarcontainersfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}