package com.stellarcontainersfsm.features.newcollectionreport

import com.stellarcontainersfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}