package com.stellarcontainersfsm.features.addshop.model.assigntoddlist

import com.stellarcontainersfsm.base.BaseResponse

/**
 * Created by Saikat on 03-10-2018.
 */
class AssignToDDListResponseModel : BaseResponse() {
    var assigned_to_dd_list: List<AssignToDDListDataModel>? = null
}