package com.stellarcontainersfsm.features.login.model.productlistmodel

import com.stellarcontainersfsm.app.domain.NewOrderScrOrderEntity
import com.stellarcontainersfsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}