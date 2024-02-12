package com.stellarcontainersfsm.features.photoReg.adapter

import com.stellarcontainersfsm.features.photoReg.model.ProsCustom
import com.stellarcontainersfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}