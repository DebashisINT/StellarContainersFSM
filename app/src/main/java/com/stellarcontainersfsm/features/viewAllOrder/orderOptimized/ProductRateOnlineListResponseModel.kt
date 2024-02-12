package com.stellarcontainersfsm.features.viewAllOrder.orderOptimized

import com.stellarcontainersfsm.app.domain.ProductOnlineRateTempEntity
import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}