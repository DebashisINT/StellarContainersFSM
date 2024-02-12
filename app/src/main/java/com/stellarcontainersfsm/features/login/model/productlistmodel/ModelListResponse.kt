package com.stellarcontainersfsm.features.login.model.productlistmodel

import com.stellarcontainersfsm.app.domain.ModelEntity
import com.stellarcontainersfsm.app.domain.ProductListEntity
import com.stellarcontainersfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}