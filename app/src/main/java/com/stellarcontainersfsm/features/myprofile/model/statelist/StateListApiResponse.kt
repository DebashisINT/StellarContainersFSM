package com.stellarcontainersfsm.features.myprofile.model.statelist

import com.stellarcontainersfsm.base.BaseResponse


/**
 * Created by Pratishruti on 19-02-2018.
 */
class StateListApiResponse: BaseResponse() {
    var state_list:List<StateListData>? = null
}