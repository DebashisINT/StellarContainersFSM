package com.stellarcontainersfsm.features.orderList.model

import com.stellarcontainersfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}