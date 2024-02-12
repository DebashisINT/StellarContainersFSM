package com.stellarcontainersfsm.features.photoReg.present

import com.stellarcontainersfsm.app.domain.ProspectEntity
import com.stellarcontainersfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}